package com.example.nexisandroid;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.nexisandroid.databinding.ActivityAddUserInfoBindingImpl;
import com.example.nexisandroid.databinding.ActivityMainBindingImpl;
import com.example.nexisandroid.databinding.ActivityNexisWelcomeBindingImpl;
import com.example.nexisandroid.databinding.ActivityNxsSignupBindingImpl;
import com.example.nexisandroid.databinding.NexisToolbarAuthBindingImpl;
import com.example.nexisandroid.databinding.WelcomAuthSelectionBottomSheetBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYADDUSERINFO = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYNEXISWELCOME = 3;

  private static final int LAYOUT_ACTIVITYNXSSIGNUP = 4;

  private static final int LAYOUT_NEXISTOOLBARAUTH = 5;

  private static final int LAYOUT_WELCOMAUTHSELECTIONBOTTOMSHEET = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.nexisandroid.R.layout.activity_add_user_info, LAYOUT_ACTIVITYADDUSERINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.nexisandroid.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.nexisandroid.R.layout.activity_nexis_welcome, LAYOUT_ACTIVITYNEXISWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.nexisandroid.R.layout.activity_nxs_signup, LAYOUT_ACTIVITYNXSSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.nexisandroid.R.layout.nexis_toolbar_auth, LAYOUT_NEXISTOOLBARAUTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.nexisandroid.R.layout.welcom_auth_selection_bottom_sheet, LAYOUT_WELCOMAUTHSELECTIONBOTTOMSHEET);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYADDUSERINFO: {
          if ("layout/activity_add_user_info_0".equals(tag)) {
            return new ActivityAddUserInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_user_info is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNEXISWELCOME: {
          if ("layout/activity_nexis_welcome_0".equals(tag)) {
            return new ActivityNexisWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_nexis_welcome is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNXSSIGNUP: {
          if ("layout/activity_nxs_signup_0".equals(tag)) {
            return new ActivityNxsSignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_nxs_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_NEXISTOOLBARAUTH: {
          if ("layout/nexis_toolbar_auth_0".equals(tag)) {
            return new NexisToolbarAuthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nexis_toolbar_auth is invalid. Received: " + tag);
        }
        case  LAYOUT_WELCOMAUTHSELECTIONBOTTOMSHEET: {
          if ("layout/welcom_auth_selection_bottom_sheet_0".equals(tag)) {
            return new WelcomAuthSelectionBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for welcom_auth_selection_bottom_sheet is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_add_user_info_0", com.example.nexisandroid.R.layout.activity_add_user_info);
      sKeys.put("layout/activity_main_0", com.example.nexisandroid.R.layout.activity_main);
      sKeys.put("layout/activity_nexis_welcome_0", com.example.nexisandroid.R.layout.activity_nexis_welcome);
      sKeys.put("layout/activity_nxs_signup_0", com.example.nexisandroid.R.layout.activity_nxs_signup);
      sKeys.put("layout/nexis_toolbar_auth_0", com.example.nexisandroid.R.layout.nexis_toolbar_auth);
      sKeys.put("layout/welcom_auth_selection_bottom_sheet_0", com.example.nexisandroid.R.layout.welcom_auth_selection_bottom_sheet);
    }
  }
}
