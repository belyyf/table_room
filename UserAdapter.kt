class UserAdapter(...): ListAdapter<User, UserAdapter.VH>(Diff) {
  inner class VH(val b: ItemUserBinding): ViewHolder(b.root) {
    fun bind(u: User) { /* set texts, click+longclick handlers */ }
  }
  override fun onCreateViewHolder(...) = VH(...)
  override fun onBindViewHolder(...) = holder.bind(getItem(pos))
}
