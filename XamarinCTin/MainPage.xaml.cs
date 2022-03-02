using Android.Util;
using Com.Clevertap.Android.Sdk;
using Java.Util;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;
using Xamarin.Forms.PlatformConfiguration;

namespace XamarinCTin
{
    public partial class MainPage : ContentPage
    {
        CleverTapAPI cleverTapAPI;
        public MainPage()
        {
            InitializeComponent();
            cleverTapAPI = CleverTapAPI.GetDefaultInstance(Android.App.Application.Context);
        }
        public void createuser(Object sender, EventArgs e)
        {
            IDictionary<string, Java.Lang.Object> profileData = new Dictionary<string, Java.Lang.Object>();
            profileData.Add("Name", "Abeezer Golwala");    // String
            profileData.Add("Identity", 456);      // String or number
            profileData.Add("Email", "abeezer@xamarin.com"); // Email address of the user
            profileData.Add("Phone", "7788994455");   // Phone (with the country code, starting with +)
            profileData.Add("Gender", "M");             // Can be either M or F
            profileData.Add("DOB", new Date());         // Date of Birth. Set the Date object to the appropriate value first - requires java.util
            profileData.Add("MSG-push", true);
            profileData.Add("MSG-email", true);
            profileData.Add("MSG-sms", true);
            profileData.Add("MSG-whatsapp", true);
            cleverTapAPI.OnUserLogin(profileData);
        }
        public void pushnotif(Object sender, EventArgs e)
        {
            cleverTapAPI.PushEvent("AbeezerPushEvent");
            Log.Debug("pushnotif", "pushnotif");
            

        }
        public void inapp(Object sender, EventArgs e)
        {
            cleverTapAPI.PushEvent("abeezerinapnotif");
            Log.Debug("inapp", "inapp");
        }
        public void getmsg(Object sender, EventArgs e)
        {
            cleverTapAPI.PushEvent("Abeezergetmsg");
            Log.Debug("getmsg", "getmsg");
        }
        public void appinbox(Object sender, EventArgs e)
        {
            CleverTapAPI.GetDefaultInstance(Android.App.Application.Context).ShowAppInbox();
            Log.Debug("showinbox", "showinbox");
        }
        public void nativedp(Object sender, EventArgs e)
        {
            Log.Debug("nativeDp", "debug native");
        }
    }
}
