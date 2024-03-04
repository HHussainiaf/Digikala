package af.hhussaini.digikala.repository

import af.hhussaini.digikala.data.remote.BaseApiResponse
import af.hhussaini.digikala.data.remote.HomeApiInterface
import javax.inject.Inject

class HomeRepository @Inject constructor(private val api : HomeApiInterface) : BaseApiResponse() {

}