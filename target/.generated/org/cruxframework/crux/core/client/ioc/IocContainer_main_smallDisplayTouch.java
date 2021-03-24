package org.cruxframework.crux.core.client.ioc;

import org.cruxframework.crux.core.client.screen.views.View;
import com.google.gwt.core.client.GWT;

public class IocContainer_main_smallDisplayTouch extends org.cruxframework.crux.core.client.ioc.IocContainer {
  public IocContainer_main_smallDisplayTouch(View view){
    super(view);
  }
  public  timhortons.client.MainController.MainView gettimhortons_client_MainController_MainView(org.cruxframework.crux.core.client.ioc.IoCResource.Scope scope, String subscope){
    timhortons.client.MainController.MainView result = _getScope(scope).getValue(new org.cruxframework.crux.core.client.ioc.IocProvider<timhortons.client.MainController.MainView>(){
      public timhortons.client.MainController.MainView get(){
        return GWT.create(timhortons.client.MainController.MainView.class);
      }
    }, "timhortons.client.MainController.MainView", subscope, 
    new IocScope.CreateCallback<timhortons.client.MainController.MainView>(){
      public void onCreate(timhortons.client.MainController.MainView newObject){
      }
    }
    );
    if (scope != org.cruxframework.crux.core.client.ioc.IoCResource.Scope.SINGLETON && result.getBoundCruxViewId() == null){
      result.bindCruxView(this.getBoundCruxViewId());
    }
    return result;
  }
}
