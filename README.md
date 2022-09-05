# Translator
Free translator lib that translates from any language to any other language.

## Implementation 

Add following in settings.gradle
maven { url 'https://jitpack.io' }

[![](https://jitpack.io/v/tariqzia7523/Translator.svg)](https://jitpack.io/#tariqzia7523/Translator)

Add following in app level gradle
implementation 'com.github.tariqzia7523:Translator:Tag'


## Usage

    Translator.startTranslation(inputLanguageCode, outputLanguageCode, TextToTranslate, object : OnTranslationResult {
        override fun onSuccess(text: String) {
            Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
        }
        override fun onFailure() {
            Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_SHORT).show()
        }
    })

### you can also use

It gives you ArrayList of all languages, which can be used latter with recycler view using any custom adapter.

    val languageList = Translator.getLanguageList(this)

Modal class has three values
    Name (string)
    code (string)
    Image (Int)

##### Limitation
    ![img.png](img.png)Avoid special charactoers to pass as text to translate








 
