package md5acc54a6ea3c5f2d688696540e0f6a967;


public class LogInWeClip
	extends android.os.AsyncTask
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_doInBackground:([Ljava/lang/Object;)Ljava/lang/Object;:GetDoInBackground_arrayLjava_lang_Object_Handler\n" +
			"n_onPostExecute:(Ljava/lang/Object;)V:GetOnPostExecute_Ljava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("WeClip.Droid.AsyncTask.LogInWeClip, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", LogInWeClip.class, __md_methods);
	}


	public LogInWeClip () throws java.lang.Throwable
	{
		super ();
		if (getClass () == LogInWeClip.class)
			mono.android.TypeManager.Activate ("WeClip.Droid.AsyncTask.LogInWeClip, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public LogInWeClip (java.lang.String p0, java.lang.String p1, android.app.Activity p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == LogInWeClip.class)
			mono.android.TypeManager.Activate ("WeClip.Droid.AsyncTask.LogInWeClip, WeClip.Droid, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:Android.App.Activity, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public java.lang.Object doInBackground (java.lang.Object[] p0)
	{
		return n_doInBackground (p0);
	}

	private native java.lang.Object n_doInBackground (java.lang.Object[] p0);


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
