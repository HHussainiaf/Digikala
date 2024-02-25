package af.hhussaini.digikala.data.remote

import af.hhussaini.digikala.data.model.ResponseResult
import retrofit2.Response
import java.lang.Exception

abstract class BaseApiResponse {

    suspend fun <T> safeApiCall(apiCall: suspend () -> Response<ResponseResult<T>>): NetworkResult<T> =
        try {
            val response = apiCall()
            if (response.isSuccessful) {
                val body = response.body()
                body?.let {
                    return NetworkResult.Success(body.message, body.data)
                }
            }
            return
        } catch (e: Exception) {
            return
        }

    private fun <T> error(errorMessage: String): NetworkResult<T> =
        NetworkResult.Error("Api Call Failed: $errorMessage")

}