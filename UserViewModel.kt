class UserViewModel(app: Application): AndroidViewModel(app) {
  val repo = UserRepository(AppDatabase.getDatabase(app).userDao())
  val allUsers = repo.allUsers
  fun insert(u: User) = viewModelScope.launch { repo.insert(u) }
  fun delete(u: User) = viewModelScope.launch { repo.delete(u) }
}
