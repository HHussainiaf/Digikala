package af.hhussaini.digikala.data.model

import af.hhussaini.digikala.data.remote.NetworkResult

data class ResponseResult<T>(
    val message: String,
    val data: T,
    val success: Boolean
)
