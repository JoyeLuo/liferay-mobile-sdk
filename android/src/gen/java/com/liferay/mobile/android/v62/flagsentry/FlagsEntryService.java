package com.liferay.mobile.android.v62.flagsentry;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;

@Path("/flagsentry")
public interface FlagsEntryService {
  @Path("/add-entry")
  Call<Response> addEntry(@Param("className") String className, @Param("classPK") long classPK, @Param("reporterEmailAddress") String reporterEmailAddress, @Param("reportedUserId") long reportedUserId, @Param("contentTitle") String contentTitle, @Param("contentURL") String contentURL, @Param("reason") String reason, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
