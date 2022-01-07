package soc.life.familydaily.core_adapter

import androidx.recyclerview.widget.DiffUtil

class DiffUtilCallback : DiffUtil.ItemCallback<ViewHolderType>() {

    override fun areItemsTheSame(oldItem: ViewHolderType, newItem: ViewHolderType): Boolean =
        oldItem.areItemsTheSame(newItem)

    override fun areContentsTheSame(oldItem: ViewHolderType, newItem: ViewHolderType): Boolean =
        oldItem.areContentsTheSame(newItem)

    override fun getChangePayload(oldItem: ViewHolderType, newItem: ViewHolderType): Any? =
        oldItem.getChangePayload(newItem)
}