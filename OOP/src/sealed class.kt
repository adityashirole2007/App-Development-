

 sealed class Result{
     data class Success(val data: String) : Result()
     data class Error(val message: String): Result()
     object Loading : Result()
 }
 fun processResult(result:Result) {
     
     when(result) {
         is Result.Error -> println("Error aaya hai: ${result.message}")
         Result.Loading -> println("data load ho raha hai")
         is Result.Success -> println("Data mila ${result.data}")
     }
 }
 fun main() {
     val success = Result.Success("user profile fetched")
     val error = Result.Error("Network failed")
     val loading = Result.Loading

     processResult(success)
     processResult(error)
     processResult(loading)
 }