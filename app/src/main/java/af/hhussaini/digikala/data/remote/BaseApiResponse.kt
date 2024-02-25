package af.hhussaini.digikala.data.remote

import retrofit2.Response

abstract class BaseApiResponse {

    suspend fun <T> safeApiCall(apiCall: suspend ()-> Response<>)
    
}