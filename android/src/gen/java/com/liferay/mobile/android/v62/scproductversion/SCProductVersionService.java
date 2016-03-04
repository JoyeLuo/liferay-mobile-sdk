package com.liferay.mobile.android.v62.scproductversion;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/scproductversion")
public interface SCProductVersionService {
  @Path("/add-product-version")
  Call<JSONObject> addProductVersion(@Param("productEntryId") long productEntryId, @Param("version") String version, @Param("changeLog") String changeLog, @Param("downloadPageURL") String downloadPageURL, @Param("directDownloadURL") String directDownloadURL, @Param("testDirectDownloadURL") boolean testDirectDownloadURL, @Param("repoStoreArtifact") boolean repoStoreArtifact, @Param("frameworkVersionIds") JSONArray frameworkVersionIds, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-product-version")
  Call<Response> deleteProductVersion(@Param("productVersionId") long productVersionId);

  @Path("/get-product-version")
  Call<JSONObject> getProductVersion(@Param("productVersionId") long productVersionId);

  @Path("/get-product-versions")
  Call<JSONArray> getProductVersions(@Param("productEntryId") long productEntryId, @Param("start") int start, @Param("end") int end);

  @Path("/get-product-versions-count")
  Call<Integer> getProductVersionsCount(@Param("productEntryId") long productEntryId);

  @Path("/update-product-version")
  Call<JSONObject> updateProductVersion(@Param("productVersionId") long productVersionId, @Param("version") String version, @Param("changeLog") String changeLog, @Param("downloadPageURL") String downloadPageURL, @Param("directDownloadURL") String directDownloadURL, @Param("testDirectDownloadURL") boolean testDirectDownloadURL, @Param("repoStoreArtifact") boolean repoStoreArtifact, @Param("frameworkVersionIds") JSONArray frameworkVersionIds);
}
