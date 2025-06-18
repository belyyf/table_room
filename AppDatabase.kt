@Database(entities=[User::class], version=1)
abstract class AppDatabase: RoomDatabase() {
  abstract fun userDao(): UserDao
  companion object { /* singleton builder */ }
}
