package mono.com.clevertap.android.sdk;


public class TaskManager_TaskListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.TaskManager.TaskListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doInBackground:(Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_Ljava_lang_Object_Handler:Com.Clevertap.Android.Sdk.TaskManager/ITaskListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_onPostExecute:(Ljava/lang/Object;)V:GetOnPostExecute_Ljava_lang_Object_Handler:Com.Clevertap.Android.Sdk.TaskManager/ITaskListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.TaskManager+ITaskListenerImplementor, CleverTap.Bindings.Android", TaskManager_TaskListenerImplementor.class, __md_methods);
	}


	public TaskManager_TaskListenerImplementor ()
	{
		super ();
		if (getClass () == TaskManager_TaskListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.TaskManager+ITaskListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object doInBackground (java.lang.Object p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object p0);


	public void onPostExecute (java.lang.Object p0)
	{
		n_onPostExecute (p0);
	}

	private native void n_onPostExecute (java.lang.Object p0);

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
