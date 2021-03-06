package com.adsdk.sdk.video;

import android.app.Activity;
import android.view.View;


public class WebChromeClient extends android.webkit.WebChromeClient {
	private RichMediaActivity mActivity;

	public WebChromeClient(Activity context) {
		super();
		if (context instanceof RichMediaActivity) {
			this.mActivity = (RichMediaActivity) context;
		}
	}

	@Override
	public void onShowCustomView(View view, CustomViewCallback callback) {
		if (mActivity == null) {
			super.onShowCustomView(view, callback);
		} else {
			mActivity.onShowCustomView(view, callback);
		}
	}

	@Override
	public void onHideCustomView() {
		if (mActivity == null) {
			super.onHideCustomView();
		} else {
			mActivity.onHideCustomView();
		}
	}
}