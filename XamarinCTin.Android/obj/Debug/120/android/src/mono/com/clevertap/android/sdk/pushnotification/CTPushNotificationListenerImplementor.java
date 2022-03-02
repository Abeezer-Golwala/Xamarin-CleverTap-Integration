package mono.com.clevertap.android.sdk.pushnotification;


public class CTPushNotificationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.pushnotification.CTPushNotificationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNotificationClickedPayloadReceived:(Ljava/util/HashMap;)V:GetOnNotificationClickedPayloadReceived_Ljava_util_HashMap_Handler:Com.Clevertap.Android.Sdk.Pushnotification.ICTPushNotificationListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Pushnotification.ICTPushNotificationListenerImplementor, CleverTap.Bindings.Android", CTPushNotificationListenerImplementor.class, __md_methods);
	}


	public CTPushNotificationListenerImplementor ()
	{
		super ();
		if (getClass () == CTPushNotificationListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Pushnotification.ICTPushNotificationListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onNotificationClickedPayloadReceived (java.util.HashMap p0)
	{
		n_onNotificationClickedPayloadReceived (p0);
	}

	private native void n_onNotificationClickedPayloadReceived (java.util.HashMap p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
