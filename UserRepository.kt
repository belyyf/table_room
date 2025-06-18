class UserRepository(private val dao: UserDao) {
  val allUsers = dao.getAll()
  suspend fun insert(u: User) = dao.insert(u)
  suspend fun delete(u: User) = dao.delete(u)
}
