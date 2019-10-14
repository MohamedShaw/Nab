package com.project;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

import com.airship.customwebview.CustomWebViewPackage;
import com.christopherdro.RNPrint.RNPrintPackage;
import com.rumax.reactnative.pdfviewer.PDFViewPackage;
import ui.toasty.RNToastyPackage;
import cl.json.RNSharePackage;
import com.amsoft.RNProgressHUB.RNProgressHUBPackage;
import com.cmcewen.blurview.BlurViewPackage;
import com.dylanvann.fastimage.FastImageViewPackage;

import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.NavigationReactNativeHost;
import com.reactnativenavigation.react.ReactGateway;


public class MainApplication extends NavigationApplication {

    @Override
    protected ReactGateway createReactGateway() {
        ReactNativeHost host = new NavigationReactNativeHost(this, isDebug(), createAdditionalReactPackages()) {
            @Override
            protected String getJSMainModuleName() {
                return "index";
            }
        };
        return new ReactGateway(this, isDebug(), host);
    }

    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    protected List<ReactPackage> getPackages() {
        // Add additional packages you require here
        // No need to add RnnPackage and MainReactPackage
        return Arrays.<ReactPackage>asList(
            // eg. new VectorIconsPackage()
          new MainReactPackage(),
          new CustomWebViewPackage(),
          new RNPrintPackage(),
          new PDFViewPackage(),
          new RNToastyPackage(),
          new RNSharePackage(),
          new RNProgressHUBPackage(),
          new BlurViewPackage(),
          new FastImageViewPackage()
        );
    }

    @Override
    public List<ReactPackage> createAdditionalReactPackages() {
        return getPackages();
    }
}
