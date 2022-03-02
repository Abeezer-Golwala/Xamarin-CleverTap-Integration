package mono.com.clevertap.android.sdk.featureFlags;


public class FeatureFlagListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.featureFlags.FeatureFlagListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_featureFlagsDidUpdate:()V:GetFeatureFlagsDidUpdateHandler:Com.Clevertap.Android.Sdk.FeatureFlags.IFeatureFlagListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_fetchFeatureFlags:()V:GetFetchFeatureFlagsHandler:Com.Clevertap.Android.Sdk.FeatureFlags.IFeatureFlagListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.FeatureFlags.IFeatureFlagListenerImplementor, CleverTap.Bindings.Android", FeatureFlagListenerImplementor.class, __md_methods);
	}


	public FeatureFlagListenerImplementor ()
	{
		super ();
		if (getClass () == FeatureFlagListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.FeatureFlags.IFeatureFlagListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void featureFlagsDidUpdate ()
	{
		n_featureFlagsDidUpdate ();
	}

	private native void n_featureFlagsDidUpdate ();


	public void fetchFeatureFlags ()
	{
		n_fetchFeatureFlags ();
	}

	private native void n_fetchFeatureFlags ();

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
