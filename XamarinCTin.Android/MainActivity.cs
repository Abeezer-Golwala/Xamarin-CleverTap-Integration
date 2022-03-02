using System;

using Android.App;
using Android.Content.PM;
using Android.Runtime;
using Android.OS;
using Com.Clevertap.Android.Sdk;
using System.Collections.Generic;
using Java.Util;
using Firebase.Iid;
using Android.Gms.Extensions;
using Android.Util;
namespace XamarinCTin.Droid
{
    [Activity(Label = "XamarinCTin", Icon = "@mipmap/icon", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation | ConfigChanges.UiMode | ConfigChanges.ScreenLayout | ConfigChanges.SmallestScreenSize )]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity
    {
        CleverTapAPI cleverTapAPI;
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            global::Xamarin.Forms.Forms.Init(this, savedInstanceState);
            LoadApplication(new App());
            cleverTapAPI = CleverTapAPI.GetDefaultInstance(Android.App.Application.Context);
            CleverTapAPI.CreateNotificationChannel(Android.App.Application.Context, "abtest", "abtest", "Xamarin", 5, true);
            CleverTapAPI.GetDefaultInstance(Android.App.Application.Context).InitializeInbox();
            PushTokenAsync();//Send token to dashboard
        }

        private async System.Threading.Tasks.Task PushTokenAsync()
        {
            var instanceIdResult = await FirebaseInstanceId.Instance.GetInstanceId().AsAsync<IInstanceIdResult>();
            string token = instanceIdResult.Token;
            CleverTapAPI.GetDefaultInstance(Android.App.Application.Context).PushFcmRegistrationId(token, true);
            Log.Debug("TOken", "token Sent" + token);
        }
        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Android.Content.PM.Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }
        
    }
}