package soc.life.familydaily.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseBottomSheetFragment<T: ViewBinding> : BottomSheetDialogFragment() {

    abstract val inflater: (LayoutInflater, ViewGroup?, Boolean) -> T
    protected val binding: T get() = _binding!!
    private var _binding: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setStyle(DialogFragment.STYLE_NORMAL, R.style.)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflater(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initDialog()
        initUI()
        initUX()
        initViewModel()
    }

    open fun initDialog() {}

    open fun initUI() {}

    open fun initUX() {}

    open fun initViewModel() {}

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}