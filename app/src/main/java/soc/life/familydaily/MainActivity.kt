package soc.life.familydaily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import soc.life.familydaily.naviagation.Router
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        router.bind(this)
        router.onCreate(this)

    }

    override fun onResume() {
        super.onResume()
        router.bind(this)
    }
}