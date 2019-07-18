package com.ubrain.drawerdemoprogramm

import android.content.Context
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.*
import android.widget.ImageView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_custom_drawer_left.*
import kotlinx.android.synthetic.main.app_bar_custom_drawer_left.*
import org.json.JSONException
import org.json.JSONObject




class CustomDrawerLeftActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var rcyCallApiMandir: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_drawer_left)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        rcyCallApiMandir = findViewById(R.id.rcy_call_api_mandir)
        rcyCallApiMandir!!.setHasFixedSize(true)
        rcyCallApiMandir!!.layoutManager = GridLayoutManager(this@CustomDrawerLeftActivity, 2)
        /*  sList!!.add(CallApiRecipeModel("title1","dbfhvnfjvdj"))
          sList!!.add(CallApiRecipeModel("title1","dbfhvnfjvdj gdbcndjnchc hdbdbhbnj bdhbknjkkj"))
          sList!!.add(CallApiRecipeModel("title1","dbfhvnfjvdj dnhchnjfnhnm hdbdbhbnj bdhbknjkkj"))
          sList!!.add(CallApiRecipeModel("title1","dbfhvnfjvdj"))
          sList!!.add(CallApiRecipeModel("title1","dbfhvnfjvdj gfbdhyb"))
          sList!!.add(CallApiRecipeModel("title1","dbfhvn dnhchnjfnhnm hdbdbhbnj bdhbknjkkj"))
          rcyCallApiMandir!!.adapter = RcyCallApiMandirAdapter(this@CustomDrawerLeftActivity, sList!!)*/
        //getApiData()
    }

    /*private fun getApiData() {
        val imgUrlList: ArrayList<String> = ArrayList()
        val apiInterface = ApiClient().getClient().create(ApiInterface::class.java)
        val call3 = apiInterface.getMandirImg()
        call3.enqueue(object : Callback<JsonElement> {
            override fun onResponse(call: Call<JsonElement>, response: Response<JsonElement>) {
                if (response.isSuccessful) {
                    if (response.body() != null) {
                        Toast.makeText(applicationContext, "response not null", Toast.LENGTH_SHORT).show()
                        val root = response.body()!!.toString()
                        try {
                            val jsonObjectroot = JSONObject(root)
                            // val mandirName = jsonObjectroot.getString("mandir")
                            val imgArray = jsonObjectroot.getJSONArray("images")
                            for (i in 0 until imgArray.length()) {
                                val imgObject = imgArray.getJSONObject(i)
                                imgUrlList.add(imgObject.getString("imageloc"))
                            }
                            rcyCallApiMandir!!.adapter = RcyCallApiMandirAdapter(this@CustomDrawerLeftActivity, imgUrlList)
                        } catch (e: JSONException) {
                            e.printStackTrace()
                        }

                    } else {
                        Toast.makeText(applicationContext, "response null", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(applicationContext, "response not success", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<JsonElement>, t: Throwable) {
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
            }
        })

    }*/

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.custom_drawer_left, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_inbox -> {
                Toast.makeText(this, "Inbox", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_starred -> {
                Toast.makeText(this, "Starred", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_sent_mail -> {
                Toast.makeText(this, "Sent Mail", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_draft -> {
                Toast.makeText(this, "Draft", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_trace -> {
                Toast.makeText(this, "Trace", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_setting -> {
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }


/*
    class RcyCallApiMandirAdapter(context1: Context, imgUrlList1: ArrayList<String>) : RecyclerView.Adapter<RcyCallApiMandirAdapter.Tempo>() {
        private var context: Context? = null
        private var imgUrlList: ArrayList<String>? = null

        init {
            this.context = context1
            this.imgUrlList = imgUrlList1
        }

        override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Tempo {
            return Tempo(LayoutInflater.from(context!!).inflate(R.layout.adapter_rcy_call_api_item, p0, false))
        }

        override fun getItemCount(): Int {
            return imgUrlList!!.size
        }

        override fun onBindViewHolder(p0: Tempo, p1: Int) {
            */
/* p0.txt1!!.text = imgUrlList!![p1].titleS
             p0.txt_2!!.text = imgUrlList!![p1].textS*//*

            Glide.with(context!!).load(imgUrlList!![p1]).into(p0.imgAdapter!!)

            //   Glide.with(context!!).apply { RequestOptions.placeholderOf(R.drawable.side_nav_bar).error(R.drawable.side_nav_bar) }.load(imgUrl).into(imageView)
        }

        class Tempo(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var imgAdapter: ImageView? = null
            */
/*  var txt1: TextView? = null
              var txt_2: TextView? = null*//*


            init {
//            txt1 = itemView.findViewById(R.id.txt1)
//            txt_2 = itemView.findViewById(R.id.txt_2)
                imgAdapter = itemView.findViewById(R.id.img_adapter_call_api)
            }
        }
    }
*/
}
/* override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = LayoutInflater.from(context!!).inflate(R.layout.adapter_rcy_call_api_item, p2, false)
        val imgAdapter: ImageView = view.findViewById(R.id.img_adapter_call_api)
        imgAdapter.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        imgAdapter.adjustViewBounds = true
        imgAdapter.scaleType = ImageView.ScaleType.FIT_XY
     //   Glide.with(context!!).apply { RequestOptions.placeholderOf(R.drawable.side_nav_bar).error(R.drawable.side_nav_bar) }.load(imgUrlList!![p0]).into(imgAdapter)

        Picasso.with(context!!).load(imgUrlList!![p0]).into(imgAdapter)

        return view
    }

    override fun getItem(p0: Int): Any {
        return imgUrlList!![p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return imgUrlList!!.size
    }
*/