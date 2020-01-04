package com.example.android.marsrealestate.overview;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.marsrealestate.R;

public class OverviewFragmentDirections {
  private OverviewFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionShowDetail() {
    return new ActionOnlyNavDirections(R.id.action_showDetail);
  }
}
