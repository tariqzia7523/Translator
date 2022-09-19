package com.free.translator

import android.content.Context
import android.util.Log
import com.google.gson.JsonArray
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object Translator {
    
    fun getLanguageList(context: Context) : ArrayList<LanguageModel>{
        val languageList = ArrayList<LanguageModel>()
        var langModel = LanguageModel()
        langModel.name = context.getString(R.string.afrikaans)
        langModel.code = "af"
        langModel.image = R.drawable.afrikaans
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.albanian)
        langModel.code = "sq"
        langModel.image = R.drawable.albanian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.amharic)
        langModel.code = "am"
        langModel.image = R.drawable.amharic
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.arabic)
        langModel.code = "ar"
        langModel.image = R.drawable.arabic
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.armenian)
        langModel.code = "hy"
        langModel.image = R.drawable.armenian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.azarbijani)
        langModel.code = "az"
        langModel.image = R.drawable.azerbaijan
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.basque)
        langModel.code = "eu"
        langModel.image = R.drawable.basque
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.belarusian)
        langModel.code = "be"
        langModel.image = R.drawable.belarusian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.bengali)
        langModel.code = "bn"
        langModel.image = R.drawable.bengali
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.bosnian)
        langModel.code = "bs"
        langModel.image = R.drawable.bosnian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.bulgarian)
        langModel.code = "bg"
        langModel.image = R.drawable.bulgarian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.burmese)
        langModel.code = "my"
        langModel.image = R.drawable.burmese
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.cebuano)
        langModel.code = "ca"
        langModel.image = R.drawable.ceubano
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.chines)
        langModel.code = "zh"
        langModel.image = R.drawable.chinese
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.croatian)
        langModel.code = "hr"
        langModel.image = R.drawable.croatian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.czech)
        langModel.code = "cs"
        langModel.image = R.drawable.czech
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.danish)
        langModel.code = "da"
        langModel.image = R.drawable.danish
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.dutch)
        langModel.code = "nl"
        langModel.image = R.drawable.dutch
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.english)
        langModel.code = "en"
        langModel.image = R.drawable.english
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.esperanto)
        langModel.code = "eo"
        langModel.image = R.drawable.esperanto
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.estonin)
        langModel.code = "et"
        langModel.image = R.drawable.estonian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.finiish)
        langModel.code = "fi"
        langModel.image = R.drawable.finnish
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.franch)
        langModel.code = "fr"
        langModel.image = R.drawable.french
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.galician)
        langModel.code = "gl"
        langModel.image = R.drawable.galician
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.georgian)
        langModel.code = "ka"
        langModel.image = R.drawable.georgian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.german)
        langModel.code = "de"
        langModel.image = R.drawable.german
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.greek)
        langModel.code = "el"
        langModel.image = R.drawable.greek
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.gujrati)
        langModel.code = "gu"
        langModel.image = R.drawable.gujarati
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.haitian)
        langModel.code = "ht"
        langModel.image = R.drawable.haitian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.korean)
        langModel.code = "ko"
        langModel.image = R.drawable.korean
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.kyrgyz)
        langModel.code = "ky"
        langModel.image = R.drawable.kyrgyz
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.latvian)
        langModel.code = "lv"
        langModel.image = R.drawable.latvian
        languageList.add(langModel)


        langModel = LanguageModel()
        langModel.name = context.getString(R.string.lithuanian)
        langModel.code = "lt"
        langModel.image = R.drawable.lithuanian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.luxembourgish)
        langModel.code = "lb"
        langModel.image = R.drawable.luxembourgish
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.macedonian)
        langModel.code = "mk"
        langModel.image = R.drawable.macedonian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.malagasy)
        langModel.code = "mg"
        langModel.image = R.drawable.malagasy
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.malay)
        langModel.code = "ms"
        langModel.image = R.drawable.malay
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.maltese)
        langModel.code = "mt"
        langModel.image = R.drawable.maltese
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.maori)
        langModel.code = "mi"
        langModel.image = R.drawable.maori
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.marathi)
        langModel.code = "mr"
        langModel.image = R.drawable.marathi
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.mongolian)
        langModel.code = "mn"
        langModel.image = R.drawable.mongolian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.nepali)
        langModel.code = "ne"
        langModel.image = R.drawable.nepali
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.persian)
        langModel.code = "fa"
        langModel.image = R.drawable.persian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.polish)
        langModel.code = "pl"
        langModel.image = R.drawable.polish
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.portuguese)
        langModel.code = "pt"
        langModel.image = R.drawable.portuguese
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.punjabi)
        langModel.code = "pa"
        langModel.image = R.drawable.punjabi
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.romanian)
        langModel.code = "ro"
        langModel.image = R.drawable.romanian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.russian)
        langModel.code = "ru"
        langModel.image = R.drawable.russian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.serbian)
        langModel.code = "sr"
        langModel.image = R.drawable.serbian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.sinhala)
        langModel.code = "si"
        langModel.image = R.drawable.sinhala
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.slovak)
        langModel.code = "sl"
        langModel.image = R.drawable.slovakian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.spanish)
        langModel.code = "es"
        langModel.image = R.drawable.spanish
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.swahili)
        langModel.code = "sw"
        langModel.image = R.drawable.swahili
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.swedish)
        langModel.code = "sv"
        langModel.image = R.drawable.swedish
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.tagalog)
        langModel.code = "tl"
        langModel.image = R.drawable.tagalugu
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.tajik)
        langModel.code = "tg"
        langModel.image = R.drawable.tajik
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.telugu)
        langModel.code = "te"
        langModel.image = R.drawable.telugu
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.thai)
        langModel.code = "th"
        langModel.image = R.drawable.thai
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.turkish)
        langModel.code = "tr"
        langModel.image = R.drawable.turkish
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.ukrainian)
        langModel.code = "uk"
        langModel.image = R.drawable.ukrainian
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.urdu)
        langModel.code = "ur"
        langModel.image = R.drawable.urdu
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.uzbek)
        langModel.code = "uz"
        langModel.image = R.drawable.uzbek
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.vietnamese)
        langModel.code = "vi"
        langModel.image = R.drawable.vietnamese
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.welsh)
        langModel.code = "cy"
        langModel.image = R.drawable.welsh
        languageList.add(langModel)

        langModel = LanguageModel()
        langModel.name = context.getString(R.string.yiddish)
        langModel.code = "yi"
        langModel.image = R.drawable.yiddish
        languageList.add(langModel)

        return languageList
    }

    fun startTranslation(inputLangCode : String, outputLangCode : String, textToTranslate : String,onTranslationResult: OnTranslationResult){
        val call = RetrofitClient.getInstance().myApi.getAllNews("gtx",inputLangCode, outputLangCode, "t",textToTranslate)
        call.enqueue(object : Callback<JsonArray?> {
            override fun onResponse(call: Call<JsonArray?>, response: Response<JsonArray?>) {
                Log.e("***MYTAG", "Size "+response.body().toString())
                try {
                    var outputString = ""
                    val res1 = response.body()!!.get(0).asJsonArray


                    try{
                        for(j in 0 until res1.size()){
                            try{
                                val res3 = res1.get(j).asJsonArray
                                try{
                                    outputString += res3.get(0).asString
                                }catch (e : Exception){
                                    e.printStackTrace()
                                }
                            }catch (e :Exception){
                                e.printStackTrace()
                            }
                        }
                    }catch (e : Exception){
                        e.printStackTrace()
                    }
//                    for(i in 0 until res1.size()){
//                        try{
//                            val res2 = res1.get(i).asJsonArray
//                            for(j in 0 until res1.size()){
//                                try{
//                                    val res3 = res1.get(j).asJsonArray
//                                    try{
//                                        outputString += res3.get(0).asString
//                                    }catch (e : Exception){
//                                        e.printStackTrace()
//                                    }
//                                }catch (e :Exception){
//                                    e.printStackTrace()
//                                }
//                            }
//                        }catch (e :Exception){
//                            e.printStackTrace()
//                        }
//                    }


                    Log.e("***Value", "output is " + outputString)
                    onTranslationResult.onSuccess(outputString)
                } catch (e: Exception) {
                    e.printStackTrace()
                    onTranslationResult.onFailure()
                }
            }

            override fun onFailure(call: Call<JsonArray?>, t: Throwable) {
                onTranslationResult.onFailure()
            }
        })
    }
    fun getImage(code: String) : Int{
        var image = 0
        if(code == "af")
            image = R.drawable.afrikaans
        else if(code == "sq")
            image = R.drawable.albanian
        else if(code == "am")
            image = R.drawable.amharic
        else if(code == "ar")
            image = R.drawable.arabic
        else if(code == "hy")
            image = R.drawable.armenian
        else if(code == "az")
            image = R.drawable.azerbaijan
        else if(code == "eu")
            image = R.drawable.basque
        else if(code == "be")
            image = R.drawable.belarusian
        else if(code == "bn")
            image = R.drawable.bengali
        else if(code == "bs")
            image = R.drawable.bosnian
        else if(code == "bg")
            image = R.drawable.bulgarian
        else if(code == "my")
            image = R.drawable.burmese
        else if(code == "ca")
            image = R.drawable.ceubano
        else if(code == "zh")
            image = R.drawable.chinese
        else if(code == "hr")
            image = R.drawable.croatian
        else if(code == "cs")
            image = R.drawable.czech
        else if(code == "da")
            image = R.drawable.danish
        else if(code == "nl")
            image = R.drawable.dutch
        else if(code == "en")
            image = R.drawable.english
        else if(code == "eo")
            image = R.drawable.esperanto
        else if(code == "et")
            image = R.drawable.estonian
        else if(code == "fi")
            image = R.drawable.finnish
        else if(code == "fr")
            image = R.drawable.french
        else if(code == "gl")
            image = R.drawable.galician
        else if(code == "ka")
            image = R.drawable.georgian
        else if(code == "de")
            image = R.drawable.german
        else if(code == "el")
            image = R.drawable.greek
        else if(code == "gu")
            image = R.drawable.gujarati
        else if(code == "ht")
            image = R.drawable.haitian
        else if(code == "ko")
            image = R.drawable.korean
        else if(code == "ky")
            image = R.drawable.kyrgyz
        else if(code == "lv")
            image = R.drawable.latvian
        else if(code == "lt")
            image = R.drawable.lithuanian
        else if(code == "lb")
            image = R.drawable.luxembourgish
        else if(code == "mk")
            image = R.drawable.macedonian
        else if(code == "mg")
            image = R.drawable.malagasy
        else if(code == "ms")
            image = R.drawable.malay
        else if(code == "mt")
            image = R.drawable.maltese
        else if(code == "mi")
            image = R.drawable.maori
        else if(code == "mr")
            image = R.drawable.marathi
        else if(code == "mn")
            image = R.drawable.mongolian
        else if(code == "ne")
            image = R.drawable.nepali
        else if(code == "fa")
            image = R.drawable.persian
        else if(code == "pl")
            image = R.drawable.polish
        else if(code == "pt")
            image = R.drawable.portuguese
        else if(code == "pa")
            image = R.drawable.punjabi
        else if(code == "ro")
            image = R.drawable.romanian
        else if(code == "ru")
            image = R.drawable.russian
        else if(code == "sr")
            image = R.drawable.serbian
        else if(code == "si")
            image = R.drawable.sinhala
        else if(code == "sl")
            image = R.drawable.slovakian
        else if(code == "es")
            image = R.drawable.spanish
        else if(code == "sw")
            image = R.drawable.swahili
        else if(code == "sv")
            image = R.drawable.swedish
        else if(code == "tl")
            image = R.drawable.tagalugu
        else if(code == "tg")
            image = R.drawable.tajik
        else if(code == "th")
            image = R.drawable.thai
        else if(code == "tr")
            image = R.drawable.turkish
        else if(code == "uk")
            image = R.drawable.ukrainian
        else if(code == "ur")
            image = R.drawable.urdu
        else if(code == "uz")
            image = R.drawable.uzbek
        else if(code == "vi")
            image = R.drawable.vietnamese
        else if(code == "cy")
            image = R.drawable.welsh
        else if(code == "yi")
            image = R.drawable.yiddish
        return image
    }
}