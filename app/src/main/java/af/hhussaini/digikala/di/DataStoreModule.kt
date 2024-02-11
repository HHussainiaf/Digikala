package af.hhussaini.digikala.di

import af.hhussaini.digikala.data.datastore.DataStoreRepository
import af.hhussaini.digikala.data.datastore.DataStoreRepositoryImp
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Singleton
    @Provides
    fun provideDataStoreRepository(
        @ApplicationContext context: Context
    ) : DataStoreRepository = DataStoreRepositoryImp(context)

}
