package mono.com.clevertap.android.sdk;


public class CTFeatureFlagsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.CTFeatureFlagsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_featureFlagsUpdated:()V:GetFeatureFlagsUpdatedHandler:Com.Clevertap.Android.Sdk.ICTFeatureFlagsListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.ICTFeatureFlagsListenerImplementor, CleverTap.Bindings.Android", CTFeatureFlagsListenerImplementor.class, __md_methods);
	}


	public CTFeatureFlagsListenerImplementor ()
	{
		super ();
		if (getClass () == CTFeatureFlagsListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.ICTFeatureFlagsListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void featureFlagsUpdated ()
	{
		n_featureFlagsUpdated ();
	}

	private native void n_featureFlagsUpdated ();

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
