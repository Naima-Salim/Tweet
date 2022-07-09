package mima.anitab.tweetreplica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mima.anitab.tweetreplica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayDetails()
    }
    fun displayDetails(){
        var details1=Details("Mima", "2m ago", "naimasalim027@gmail.com", "i love coding" ,"", "1", "","7","","1")
        var details2=Details("Shirleen", "34m ago", "shirleen@gmail.com", "100daysofcode" ,"", "5", "","2","","2")
        var details3=Details("Yusra", "26m ago", "yusra@gmail.com", "i love Kotlin" ,"", "2", "","3","","9")
        var details4=Details("Swalha", "12m ago", "swalha@gmail.com", "my code has run" ,"", "7", "","32","","4")
        var details5=Details("Liyaan", "4m ago", "liyaan@gmail.com", "i am executing this code" ,"", "6", "","7","","4")
        var details6=Details("Nurjahaan", "8m ago", "nurjahaan@gmail.com", "terminate this code" ,"", "5", "","6","","8")
        var details7=Details("Dinarizad", "19m ago", "dinarizad@gmail.com", "i am smart and intelligent" ,"", "5", "","6","","9")
        var detailsList= listOf(details1,details2,details3,details4,details5,details6,details7)
        var detailsAdapter=DetailsRvAdapter(detailsList)
        binding.rvDetails.layoutManager=LinearLayoutManager(this)
        binding.rvDetails.adapter=detailsAdapter
    }

}