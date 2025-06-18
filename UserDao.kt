@Dao
interface UserDao {
  fun getAll(): LiveData<List<User>>
  @Insert suspend fun insert(user: User)
  @Delete suspend fun delete(user: User)
}
