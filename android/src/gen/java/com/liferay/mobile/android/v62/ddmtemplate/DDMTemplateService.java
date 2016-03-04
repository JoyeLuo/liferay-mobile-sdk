package com.liferay.mobile.android.v62.ddmtemplate;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.http.file.UploadData;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.Integer;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/ddmtemplate")
public interface DDMTemplateService {
  @Path("/add-template")
  Call<JSONObject> addTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("script") String script, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/add-template")
  Call<JSONObject> addTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("templateKey") String templateKey, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("script") String script, @Param("cacheable") boolean cacheable, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallImageFile") UploadData smallImageFile, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/copy-template")
  Call<JSONObject> copyTemplate(@Param("templateId") long templateId, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/copy-template")
  Call<JSONObject> copyTemplate(@Param("templateId") long templateId, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/copy-templates")
  Call<JSONArray> copyTemplates(@Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("newClassPK") long newClassPK, @Param("type") String type, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-template")
  Call<Response> deleteTemplate(@Param("templateId") long templateId);

  @Path("/fetch-template")
  Call<JSONObject> fetchTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("templateKey") String templateKey);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param("templateId") long templateId);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("templateKey") String templateKey);

  @Path("/get-template")
  Call<JSONObject> getTemplate(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("templateKey") String templateKey, @Param("includeGlobalTemplates") boolean includeGlobalTemplates);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param("groupId") long groupId, @Param("classNameId") long classNameId);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("type") String type);

  @Path("/get-templates")
  Call<JSONArray> getTemplates(@Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("type") String type, @Param("mode") String mode);

  @Path("/get-templates-by-class-pk")
  Call<JSONArray> getTemplatesByClassPk(@Param("groupId") long groupId, @Param("classPK") long classPK);

  @Path("/get-templates-by-structure-class-name-id")
  Call<JSONArray> getTemplatesByStructureClassNameId(@Param("groupId") long groupId, @Param("structureClassNameId") long structureClassNameId, @Param("start") int start, @Param("end") int end, @Param("orderByComparator") JSONObjectWrapper orderByComparator);

  @Path("/get-templates-by-structure-class-name-id-count")
  Call<Integer> getTemplatesByStructureClassNameIdCount(@Param("groupId") long groupId, @Param("structureClassNameId") long structureClassNameId);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("keywords") String keywords, @Param("type") String type, @Param("mode") String mode, @Param("start") int start, @Param("end") int end, @Param("orderByComparator") JSONObjectWrapper orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("classPKs") JSONArray classPKs, @Param("keywords") String keywords, @Param("type") String type, @Param("mode") String mode, @Param("start") int start, @Param("end") int end, @Param("orderByComparator") JSONObjectWrapper orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @Param("orderByComparator") JSONObjectWrapper orderByComparator);

  @Path("/search")
  Call<JSONArray> search(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("classPKs") JSONArray classPKs, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("andOperator") boolean andOperator, @Param("start") int start, @Param("end") int end, @Param("orderByComparator") JSONObjectWrapper orderByComparator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("classPKs") JSONArray classPKs, @Param("name") String name, @Param("description") String description, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("andOperator") boolean andOperator);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupId") long groupId, @Param("classNameId") long classNameId, @Param("classPK") long classPK, @Param("keywords") String keywords, @Param("type") String type, @Param("mode") String mode);

  @Path("/search-count")
  Call<Integer> searchCount(@Param("companyId") long companyId, @Param("groupIds") JSONArray groupIds, @Param("classNameIds") JSONArray classNameIds, @Param("classPKs") JSONArray classPKs, @Param("keywords") String keywords, @Param("type") String type, @Param("mode") String mode);

  @Path("/update-template")
  Call<JSONObject> updateTemplate(@Param("templateId") long templateId, @Param("classPK") long classPK, @Param("nameMap") JSONObject nameMap, @Param("descriptionMap") JSONObject descriptionMap, @Param("type") String type, @Param("mode") String mode, @Param("language") String language, @Param("script") String script, @Param("cacheable") boolean cacheable, @Param("smallImage") boolean smallImage, @Param("smallImageURL") String smallImageURL, @Param("smallImageFile") UploadData smallImageFile, @Param("serviceContext") JSONObjectWrapper serviceContext);
}
