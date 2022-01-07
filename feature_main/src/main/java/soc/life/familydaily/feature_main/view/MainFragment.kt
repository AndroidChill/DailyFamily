package soc.life.familydaily.feature_main.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import soc.life.familydaily.core.base.BaseFragment
import soc.life.familydaily.core.di.BaseViewModelFactory
import soc.life.familydaily.feature_main.viewModel.MainViewModel
import javax.inject.Inject
import soc.life.familydaily.feature_main.databinding.FragmentMainBinding as Binding

@AndroidEntryPoint
class MainFragment : BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    @Inject
    lateinit var mainViewModelFactory: BaseViewModelFactory<MainViewModel>

    private val viewModel: MainViewModel by viewModels (
        factoryProducer = { mainViewModelFactory }
    )

    override fun initUI() {

    }

    override fun initUX() {
        with(binding) {
            btnStoryCreate.setOnClickListener {
                viewModel.onStoryClick()
            }
        }
    }

    override fun initViewModel() {

    }
}