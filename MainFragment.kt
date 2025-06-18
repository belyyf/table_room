class MainFragment: Fragment() {
  onViewCreated {
    setup RecyclerView, adapter
    vm.allUsers.observe { adapter.submitList(it) }
    buttonRefresh.setOnClickListener { /* re-read LiveData */ }
    btnAdd.setOnClickListener { show Dialog(name,age,email)->vm.insert }
    adapter.onLongClick = { vm.delete(it) }
    adapter.onClick = { show DetailFragment via Bundle }
  }
}
