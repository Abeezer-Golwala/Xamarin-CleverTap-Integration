package mono.com.clevertap.android.sdk;


public class BaseCTApiListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.BaseCTApiListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_config:()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;:GetConfigHandler:Com.Clevertap.Android.Sdk.IBaseCTApiListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_context:()Landroid/content/Context;:GetContextHandler:Com.Clevertap.Android.Sdk.IBaseCTApiListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.IBaseCTApiListenerImplementor, CleverTap.Bindings.Android", BaseCTApiListenerImplementor.class, __md_methods);
	}


	public BaseCTApiListenerImplementor ()
	{
		super ();
		if (getClass () == BaseCTApiListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.IBaseCTApiListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public com.clevertap.android.sdk.CleverTapInstanceConfig config ()
	{
		return n_config ();
	}

	private native com.clevertap.android.sdk.CleverTapInstanceConfig n_config ();


	public android.content.Context context ()
	{
		return n_context ();
	}

	private native android.content.Context n_context ();

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
