package af.hhussaini.digikala.data.model

// this class
data class ResponseResult<T>(
    val message: String,
    val data: T,
    val success: Boolean
)
