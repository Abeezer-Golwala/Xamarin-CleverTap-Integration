package mono.com.clevertap.android.sdk.pushnotification.amp;


public class CTPushAmpListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.pushnotification.amp.CTPushAmpListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPushAmpPayloadReceived:(Landroid/os/Bundle;)V:GetOnPushAmpPayloadReceived_Landroid_os_Bundle_Handler:Com.Clevertap.Android.Sdk.Pushnotification.Amp.ICTPushAmpListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Pushnotification.Amp.ICTPushAmpListenerImplementor, CleverTap.Bindings.Android", CTPushAmpListenerImplementor.class, __md_methods);
	}


	public CTPushAmpListenerImplementor ()
	{
		super ();
		if (getClass () == CTPushAmpListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Pushnotification.Amp.ICTPushAmpListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPushAmpPayloadReceived (android.os.Bundle p0)
	{
		n_onPushAmpPayloadReceived (p0);
	}

	private native void n_onPushAmpPayloadReceived (android.os.Bundle p0);

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
