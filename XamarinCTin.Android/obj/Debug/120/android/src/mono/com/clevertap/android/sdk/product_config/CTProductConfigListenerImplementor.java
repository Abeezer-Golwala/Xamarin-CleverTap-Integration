package mono.com.clevertap.android.sdk.product_config;


public class CTProductConfigListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.product_config.CTProductConfigListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActivated:()V:GetOnActivatedHandler:Com.Clevertap.Android.Sdk.Product_config.ICTProductConfigListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_onFetched:()V:GetOnFetchedHandler:Com.Clevertap.Android.Sdk.Product_config.ICTProductConfigListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_onInit:()V:GetOnInitHandler:Com.Clevertap.Android.Sdk.Product_config.ICTProductConfigListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.Product_config.ICTProductConfigListenerImplementor, CleverTap.Bindings.Android", CTProductConfigListenerImplementor.class, __md_methods);
	}


	public CTProductConfigListenerImplementor ()
	{
		super ();
		if (getClass () == CTProductConfigListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.Product_config.ICTProductConfigListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void onActivated ()
	{
		n_onActivated ();
	}

	private native void n_onActivated ();


	public void onFetched ()
	{
		n_onFetched ();
	}

	private native void n_onFetched ();


	public void onInit ()
	{
		n_onInit ();
	}

	private native void n_onInit ();

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
