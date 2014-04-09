package com.jemge.targets.Android;
import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.jemge.core.JApplication;

public class JStart extends AndroidApplication {
	protected JApplication start;
	
	public void main(JApplication start) {
		this.start = start;
	}
	
    public void onCreate(Bundle instance) {
        super.onCreate(instance);
		AndroidApplicationConfiguration config	= new AndroidApplicationConfiguration();
		config.useGL20							= false;
        initialize(this.start, config);
    }
}
