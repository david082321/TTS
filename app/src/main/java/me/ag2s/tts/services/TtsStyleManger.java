package me.ag2s.tts.services;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class TtsStyleManger {
    //单例
    private static volatile TtsStyleManger instance;

    public static TtsStyleManger getInstance() {
        if (instance == null) {
            synchronized (TtsStyleManger.class) {
                if (instance == null) {
                    instance = new TtsStyleManger();
                }
            }

        }
        return instance;
    }

    private final List<TtsStyle> styles;

    //https://docs.microsoft.com/zh-cn/azure/cognitive-services/speech-service/speech-synthesis-markup?tabs=csharp#adjust-speaking-styles

    private TtsStyleManger() {
        styles = new ArrayList<>(22);
        styles.add(new TtsStyle("預設", "Default", "預設值"));
        styles.add(new TtsStyle("新聞", "newscast", "以正式專業的語氣敘述新聞"));
        styles.add(new TtsStyle("客服", "customerservice", "以友好熱情的語氣為客戶提供支援"));
        styles.add(new TtsStyle("助理", "assistant", "以熱情而輕鬆的語氣對數字助理講話"));
        styles.add(new TtsStyle("聊天", "chat", "以輕鬆、隨意的語氣閒聊"));
        styles.add(new TtsStyle("冷靜", "calm", "以沉著冷靜的態度說話。 語氣、音調、韻律與其他語音類型相比要統一得多。"));//Calm
        styles.add(new TtsStyle("開心", "cheerful", "以較高的音調和音量表達歡快、熱情的語氣"));//Cheerful Happy
        styles.add(new TtsStyle("悲傷", "sad", "以較高的音調、較低的強度和較低的音量表達悲傷的語氣。 這種情緒的常見特徵是說話時嗚咽或哭泣。"));//Sad
        styles.add(new TtsStyle("惱怒", "angry", "以較低的音調、較高的強度和較高的音量來表達惱怒的語氣。 說話者處於憤怒、生氣和被冒犯的狀態。")); //Angry
        styles.add(new TtsStyle("恐懼", "fearful", "以較高的音調、較高的音量和較快的語速來表達恐懼、緊張的語氣。 說話者處於緊張和不安的狀態。"));//Fearful,Nervous
        styles.add(new TtsStyle("抱怨", "disgruntled", "表達輕蔑和抱怨的語氣。 這種情緒的語音表現出不悅和蔑視。"));// Disgruntled Complaining
        styles.add(new TtsStyle("嚴肅", "serious", "表達嚴肅和指令的語氣。 說話者的聲音通常比較僵硬，節奏也不那麼輕鬆。"));//Serious Strict
        styles.add(new TtsStyle("撒嬌", "affectionate", "以較高的音調和音量表達溫暖而親切的語氣。 說話者處於吸引聽眾注意力的狀態。 說話者的「個性」往往是討人喜歡的。"));//Affectionate Cutesy
        styles.add(new TtsStyle("溫柔", "gentle", "以較低的音調和音量表達溫和、禮貌和愉快的語氣"));//Gentle
        styles.add(new TtsStyle("抒情", "lyrical", "以優美又帶感傷的方式表達情感"));
        styles.add(new TtsStyle("尷尬", "embarrassed", "在說話者感到不舒適時表達不確定、猶豫的語氣"));//{\"Name\":\"Embarrassed\",\"LegacyNames\":[\"Shy\"]}
        styles.add(new TtsStyle("同理心", "empathetic", "表達出一種關懷和理解的感覺。"));
        styles.add(new TtsStyle("沮喪", "depressed", "調低音調和音量來表達憂鬱、沮喪的語氣"));//Depressed

        styles.add(new TtsStyle("新聞(休閒）", "newscast-casual", "以通用和隨意的語氣敘述新聞。"));
        styles.add(new TtsStyle("新聞(正式）", "newscast-formal", "以正式、自信、權威的語氣敘述新聞。"));
        styles.add(new TtsStyle("旁白-專業", "narration-professional", "對內容閱讀表達專業、客觀的語氣。（雲揚，Aria）"));
        styles.add(new TtsStyle("輕鬆閱讀", "narration-relaxed", "適合閱讀輕鬆的文章(雲希，雲健)"));

        styles.add(new TtsStyle("體育解說", "Sports_commentary", "體育解說(雲健)"));
        styles.add(new TtsStyle("體育解說(興奮)", "Sports_commentary_excited", "興奮語氣的體育解說(雲健)"));
        styles.add(new TtsStyle("樂觀的廣告", "Advertisement_upbeat", "(雲皓)Advertisement_upbeat"));


        Log.e("Style", styles.size() + "");


    }

    public @NonNull
    List<TtsStyle> getStyles() {
        return this.styles;
    }

    @SuppressWarnings("unused")
    public @NonNull
    TtsStyle get(int index) {
        if (index >= 0 && index < styles.size()) {
            return styles.get(index);
        }
        return new TtsStyle("預設", "", "預設值");
    }

}
