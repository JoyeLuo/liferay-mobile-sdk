package com.liferay.mobile.android.v62.address;

import com.liferay.mobile.android.http.Response;
import com.liferay.mobile.android.service.JSONObjectWrapper;
import com.liferay.mobile.android.v2.Call;
import com.liferay.mobile.android.v2.Param;
import com.liferay.mobile.android.v2.Path;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/address")
public interface AddressService {
  @Path("/add-address")
  Call<JSONObject> addAddress(@Param("className") String className, @Param("classPK") long classPK, @Param("street1") String street1, @Param("street2") String street2, @Param("street3") String street3, @Param("city") String city, @Param("zip") String zip, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("typeId") int typeId, @Param("mailing") boolean mailing, @Param("primary") boolean primary);

  @Path("/add-address")
  Call<JSONObject> addAddress(@Param("className") String className, @Param("classPK") long classPK, @Param("street1") String street1, @Param("street2") String street2, @Param("street3") String street3, @Param("city") String city, @Param("zip") String zip, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("typeId") int typeId, @Param("mailing") boolean mailing, @Param("primary") boolean primary, @Param("serviceContext") JSONObjectWrapper serviceContext);

  @Path("/delete-address")
  Call<Response> deleteAddress(@Param("addressId") long addressId);

  @Path("/get-address")
  Call<JSONObject> getAddress(@Param("addressId") long addressId);

  @Path("/get-addresses")
  Call<JSONArray> getAddresses(@Param("className") String className, @Param("classPK") long classPK);

  @Path("/update-address")
  Call<JSONObject> updateAddress(@Param("addressId") long addressId, @Param("street1") String street1, @Param("street2") String street2, @Param("street3") String street3, @Param("city") String city, @Param("zip") String zip, @Param("regionId") long regionId, @Param("countryId") long countryId, @Param("typeId") int typeId, @Param("mailing") boolean mailing, @Param("primary") boolean primary);
}
