package me.ag2s.tts.services;

import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TtsActorManger {
    private static final String TAG = "TtsActorManger";
    //單例

    private static final String previewNote = "預覽版語音,如果卡住了，殺掉應用重進！！！";

    private static volatile TtsActorManger instance;

    public static TtsActorManger getInstance() {
        if (instance == null) {
            synchronized (TtsActorManger.class) {
                if (instance == null) {
                    instance = new TtsActorManger();
                }
            }

        }
        return instance;
    }


    private final List<TtsActor> actors;

    private TtsActorManger() {
        actors = new ArrayList<>(180);
        //中文
        //zh-CN,云希,zh-CN-YunxiNeural,Male
        //zh-CN,云扬,zh-CN-YunyangNeural,Male
        //zh-CN,云野,zh-CN-YunyeNeural,Male
        //zh-CN,晓双,zh-CN-XiaoshuangNeural,Female
        //zh-CN,晓墨,zh-CN-XiaomoNeural,Female
        //zh-CN,晓悠,zh-CN-XiaoyouNeural,Female
        //zh-CN,晓晓,zh-CN-XiaoxiaoNeural,Female
        //zh-CN,晓涵,zh-CN-XiaohanNeural,Female
        //zh-CN,晓睿,zh-CN-XiaoruiNeural,Female
        //zh-CN,晓秋,zh-CN-XiaoqiuNeural,Female
        //zh-CN,晓萱,zh-CN-XiaoxuanNeural,Female
        //zh-CN,晓辰,zh-CN-XiaochenNeural,Female
        //zh-CN,晓颜,zh-CN-XiaoyanNeural,Female
        //zh-HK,曉佳,zh-HK-HiuGaaiNeural,Female
        //zh-HK,曉曼,zh-HK-HiuMaanNeural,Female
        //zh-HK,雲龍,zh-HK-WanLungNeural,Male
        //zh-TW,曉臻,zh-TW-HsiaoChenNeural,Female
        //zh-TW,曉雨,zh-TW-HsiaoYuNeural,Female
        //zh-TW,雲哲,zh-TW-YunJheNeural,Male

        actors.add(new TtsActor("曉曉", "zh-CN-XiaoxiaoNeural", "zh-CN", true, "活潑、溫暖的聲音，具有多種場景風格和情感。"));
        actors.add(new TtsActor("曉悠", "zh-CN-XiaoyouNeural", "zh-CN", true, "天使般的清晰聲音，可以應用於許多兒童相關場景。"));
        actors.add(new TtsActor("雲揚", "zh-CN-YunyangNeural", "zh-CN", false, "專業、流利的聲音，具有多種場景風格。"));
        actors.add(new TtsActor("雲野", "zh-CN-YunyeNeural", "zh-CN", false, "成熟、放鬆的聲音，具有多種情感，適合音訊書籍。"));
        actors.add(new TtsActor("雲希", "zh-CN-YunxiNeural", "zh-CN", false, "活潑、陽光的聲音，具有豐富的情感，可用於許多對話場景。"));


        actors.add(new TtsActor("曉北遼寧", "zh-CN-LN-XiaobeiNeural", "zh-CN", true, "東北大女孩，" + previewNote));
        actors.add(new TtsActor("雲希四川", "zh-CN-SC-YunxiNeural", "zh-CN", false, "四川小伙，" + previewNote));
        actors.add(new TtsActor("雲楓", "zh-CN-YunfengNeural", "zh-CN", false, "" + previewNote));
        actors.add(new TtsActor("雲皓", "zh-CN-YunhaoNeural", "zh-CN", false, "" + previewNote));
        actors.add(new TtsActor("雲健", "zh-CN-YunjianNeural", "zh-CN", false, "適合影視和體育解說，" + previewNote));
        actors.add(new TtsActor("雲澤", "zh-CN-YunzeNeural", "zh-CN", false, "老年男聲，" + previewNote));
        actors.add(new TtsActor("雲夏", "zh-CN-YunxiaNeural", "zh-CN", false, "少年年男聲，" + previewNote));


        actors.add(new TtsActor("曉涵", "zh-CN-XiaohanNeural", "zh-CN", true, "溫暖、甜美、富有感情的聲音，可用於許多對話場景。"));
        actors.add(new TtsActor("曉墨", "zh-CN-XiaomoNeural", "zh-CN", true, "清晰、放鬆的聲音，具有豐富的角色扮演和情感，適合音訊書籍。"));
        actors.add(new TtsActor("曉睿", "zh-CN-XiaoruiNeural", "zh-CN", true, "成熟、睿智的聲音，具有豐富的情感，適合音訊書籍。"));
        actors.add(new TtsActor("曉萱", "zh-CN-XiaoxuanNeural", "zh-CN", true, "自信、有能力的聲音，具有豐富的角色扮演和情感，適合音訊書籍。"));
        actors.add(new TtsActor("曉辰", "zh-CN-XiaochenNeural", "zh-CN", true, "休閒、放鬆的語音，用於自發性對話和會議聽錄。"));
        actors.add(new TtsActor("曉秋", "zh-CN-XiaoqiuNeural", "zh-CN", true, "智慧、舒適的語音，適合閱讀長內容。"));
        actors.add(new TtsActor("曉雙", "zh-CN-XiaoshuangNeural", "zh-CN", true, "可愛、愉悅的語音，可應用於許多兒童相關場景。"));
        actors.add(new TtsActor("曉顏", "zh-CN-XiaoyanNeural", "zh-CN", true, "訓練有素、舒適的語音，用於客戶服務和對話場景。"));


        actors.add(new TtsActor("曉佳", "zh-HK-HiuGaaiNeural", "zh-HK", true, "曉佳(HiuGaai),粵語女聲"));
        actors.add(new TtsActor("曉曼", "zh-HK-HiuMaanNeural", "zh-HK", true, "曉曼(HiuMaan),粵語女聲"));
        actors.add(new TtsActor("雲龍", "zh-HK-WanLungNeural", "zh-HK", false, "雲龍(WanLung),粵語男聲"));
        //英語（中國香港特別行政區）
        //en-HK,Sam,en-HK-SamNeural,Male
        //en-HK,Yan,en-HK-YanNeural,Female
        actors.add(new TtsActor("Yan", "en-HK-YanNeural", "en-HK", true, "Yan,港式英語女聲，不支援中文。"));
        actors.add(new TtsActor("Sam", "en-HK-SamNeural", "en-HK", false, "Sam,港式英語男聲，不支援中文。"));


        actors.add(new TtsActor("曉臻", "zh-TW-HsiaoChenNeural", "zh-TW", true, "曉臻(HsiaoChen),灣灣女聲"));
        actors.add(new TtsActor("曉雨", "zh-TW-HsiaoYuNeural", "zh-TW", true, "曉雨(HsiaoYu),灣灣女聲"));
        actors.add(new TtsActor("雲哲", "zh-TW-YunJheNeural", "zh-TW", false, "雲哲(YunJhe),灣灣男聲"));


        //日語（日本）
        //ja-JP,七海,ja-JP-NanamiNeural,Female
        //ja-JP,圭太,ja-JP-KeitaNeural,Male
        actors.add(new TtsActor("七海", "ja-JP-NanamiNeural", "ja-JP", true, "七海(Nanami),日語女聲"));
        actors.add(new TtsActor("圭太", "ja-JP-KeitaNeural", "ja-JP", false, "圭太(Keita),日語男聲"));

        //韓語（韓國）
        //ko-KR,선히,ko-KR-SunHiNeural,Female
        //ko-KR,인준,ko-KR-InJoonNeural,Male
        actors.add(new TtsActor("선히", "ko-KR-SunHiNeural", "ko-KR", true, "선히(SunHi),韓語女聲"));
        actors.add(new TtsActor("인준", "ko-KR-InJoonNeural", "ko-KR", false, "인준(InJoon),韓語男聲"));

        //美式英语
        //en-US,Amber,en-US-AmberNeural,Female
        //en-US,Ana,en-US-AnaNeural,Female
        //en-US,Aria,en-US-AriaNeural,Female
        //en-US,Ashley,en-US-AshleyNeural,Female
        //en-US,Brandon,en-US-BrandonNeural,Male
        //en-US,Christopher,en-US-ChristopherNeural,Male
        //en-US,Cora,en-US-CoraNeural,Female
        //en-US,Elizabeth,en-US-ElizabethNeural,Female
        //en-US,Eric,en-US-EricNeural,Male
        //en-US,Guy,en-US-GuyNeural,Male
        //en-US,Jacob,en-US-JacobNeural,Male
        //en-US,Jenny Multilingual,en-US-JennyMultilingualNeural,Female "de-DE,en-AU,en-CA,en-GB,es-ES,es-MX,fr-CA,fr-FR,it-IT,ja-JP,ko-KR,pt-BR,zh-CN"
        //en-US,Jenny,en-US-JennyNeural,Female
        //en-US,Michelle,en-US-MichelleNeural,Female
        //en-US,Monica,en-US-MonicaNeural,Female
        //en-US,Sara,en-US-SaraNeural,Female

        actors.add(new TtsActor("Jenny+", "en-US-JennyMultilingualNeural", "en-US", true, "多語言，支援中文，美式英語，成年女性"));
        actors.add(new TtsActor("Amber", "en-US-AmberNeural", "en-US", true, "美式英語，年輕女性"));
        actors.add(new TtsActor("Ana", "en-US-AnaNeural", "en-US", true, "美式英語，女童"));
        actors.add(new TtsActor("Aria", "en-US-AriaNeural", "en-US", true, "美式英語，成年女性"));
        actors.add(new TtsActor("Ashley", "en-US-AshleyNeural", "en-US", true, "美式英語，成年女性"));
        actors.add(new TtsActor("Cora", "en-US-CoraNeural", "en-US", true, "美式英語，成年女性"));
        actors.add(new TtsActor("Elizabeth", "en-US-ElizabethNeural", "en-US", true, "美式英語，成年女性"));
        actors.add(new TtsActor("Jenny", "en-US-JennyNeural", "en-US", true, "美式英語，成年女性"));
        actors.add(new TtsActor("Michelle", "en-US-MichelleNeural", "en-US", true, "美式英語，成年女性"));
        actors.add(new TtsActor("Monica", "en-US-MonicaNeural", "en-US", true, "美式英語，成年女性"));
        actors.add(new TtsActor("Sara", "en-US-SaraNeural", "en-US", true, "美式英語，成年女性"));

        actors.add(new TtsActor("Brandon", "en-US-BrandonNeural", "en-US", false, "美式英語，成年男性"));
        actors.add(new TtsActor("Christopher", "en-US-ChristopherNeural", "en-US", false, "美式英語，成年男性"));
        actors.add(new TtsActor("Eric", "en-US-EricNeural", "en-US", false, "美式英語，成年男性"));
        actors.add(new TtsActor("Guy", "en-US-GuyNeural", "en-US", false, "美式英語，成年男性"));
        actors.add(new TtsActor("Jacob", "en-US-JacobNeural", "en-US", false, "美式英語，成年男性"));


        //英式英語
        //en-GB,Libby,en-GB-LibbyNeural,Female
        //en-GB,Mia,en-GB-MiaNeural,Female
        //en-GB,Ryan,en-GB-RyanNeural,Male
        //en-GB,Sonia,en-GB-SoniaNeural,Female
        actors.add(new TtsActor("en-GB-LibbyNeural", true, "一般"));
        actors.add(new TtsActor("en-GB-MiaNeural", true, "一般"));
        actors.add(new TtsActor("en-GB-SoniaNeural", true, "一般"));
        actors.add(new TtsActor("en-GB-RyanNeural", false, "一般"));
        //英語（新加坡）
        //en-SG,Luna,en-SG-LunaNeural,Female
        //en-SG,Wayne,en-SG-WayneNeural,Male
        actors.add(new TtsActor("en-SG-LunaNeural", true, "一般"));
        actors.add(new TtsActor("en-SG-WayneNeural", false, "一般"));

        //英語（紐西蘭）
        //en-NZ,Mitchell,en-NZ-MitchellNeural,Male
        //en-NZ,Molly,en-NZ-MollyNeural,Female
        actors.add(new TtsActor("en-NZ-MollyNeural", true, "一般"));
        actors.add(new TtsActor("en-NZ-MitchellNeural", false, "一般"));

        //英語（南非）
        //en-ZA,Leah,en-ZA-LeahNeural,Female
        //en-ZA,Luke,en-ZA-LukeNeural,Male
        actors.add(new TtsActor("en-ZA-LeahNeural", true, "一般"));
        actors.add(new TtsActor("en-ZA-LukeNeural", false, "一般"));

        //英語（澳洲）
        //en-AU,Natasha,en-AU-NatashaNeural,Female
        //en-AU,William,en-AU-WilliamNeural,Male
        actors.add(new TtsActor("en-AU-NatashaNeural", true, "一般"));
        actors.add(new TtsActor("en-AU-WilliamNeural", false, "一般"));
        //英語（加拿大）
        //en-CA,Clara,en-CA-ClaraNeural,Female
        //en-CA,Liam,en-CA-LiamNeural,Male
        actors.add(new TtsActor("en-CA-ClaraNeural", true, "一般"));
        actors.add(new TtsActor("en-CA-LiamNeural", false, "一般"));
        //英語（印度）
        //en-IN,Neerja,en-IN-NeerjaNeural,Female
        //en-IN,Prabhat,en-IN-PrabhatNeural,Male
        actors.add(new TtsActor("en-IN-NeerjaNeural", true, "一般"));
        actors.add(new TtsActor("en-IN-PrabhatNeural", false, "一般"));
        //英語（愛爾蘭）
        //en-IE,Connor,en-IE-ConnorNeural,Male
        //en-IE,Emily,en-IE-EmilyNeural,Female
        actors.add(new TtsActor("en-IE-EmilyNeural", true, "一般"));
        actors.add(new TtsActor("en-IE-ConnorNeural", false, "一般"));
        //英語（菲律賓）
        //en-PH,James,en-PH-JamesNeural,Male
        //en-PH,Rosa,en-PH-RosaNeural,Female
        actors.add(new TtsActor("en-PH-RosaNeural", true, "一般"));
        actors.add(new TtsActor("en-PH-JamesNeural", false, "一般"));


        //俄語（俄羅斯）
        //ru-RU	ru-RU,Дария,ru-RU-DariyaNeural,Female
        //ru-RU,Дмитрий,ru-RU-DmitryNeural,Male
        //ru-RU,Светлана,ru-RU-SvetlanaNeural,Female
        actors.add(new TtsActor("ru-RU-DariyaNeural", true, "一般"));
        actors.add(new TtsActor("ru-RU-SvetlanaNeural", true, "一般"));
        actors.add(new TtsActor("ru-RU-DmitryNeural", false, "一般"));


        //阿拉伯語（埃及）
        //ar-EG,سلمى,ar-EG-SalmaNeural,Female
        //ar-EG,شاكر,ar-EG-ShakirNeural,Male
        actors.add(new TtsActor("ar-EG-SalmaNeural", true, "一般"));
        actors.add(new TtsActor("ar-EG-ShakirNeural", false, "一般"));
        //阿拉伯語（沙烏地阿拉伯）
        //ar-SA,حامد,ar-SA-HamedNeural,Male
        //ar-SA,زارية,ar-SA-ZariyahNeural,Female
        actors.add(new TtsActor("ar-SA-ZariyahNeural", true, "一般"));
        actors.add(new TtsActor("ar-SA-HamedNeural", false, "一般"));
        //保加利亞語
        //bg-BG,Борислав,bg-BG-BorislavNeural,Male
        //bg-BG,Калина,bg-BG-KalinaNeural,Female
        actors.add(new TtsActor("bg-BG-KalinaNeural", true, "一般"));
        actors.add(new TtsActor("bg-BG-BorislavNeural", false, "一般"));
        //加泰隆尼亞語(西班牙)
        //ca-ES,Alba,ca-ES-AlbaNeural,Female
        //ca-ES,Enric,ca-ES-EnricNeural,Male
        //ca-ES,Joana,ca-ES-JoanaNeural,Female
        actors.add(new TtsActor("ca-ES-AlbaNeural", true, "一般"));
        actors.add(new TtsActor("ca-ES-JoanaNeural", true, "一般"));
        actors.add(new TtsActor("ca-ES-EnricNeural", false, "一般"));
        //克羅埃西亞語（克羅埃西亞)
        //hr-HR,Gabrijela,hr-HR-GabrijelaNeural,Female
        //hr-HR,Srećko,hr-HR-SreckoNeural,Male
        actors.add(new TtsActor("hr-HR-GabrijelaNeural", true, "一般"));
        actors.add(new TtsActor("hr-HR-SreckoNeural", false, "一般"));
        //捷克語（捷克)
        //cs-CZ,Antonín,cs-CZ-AntoninNeural,Male
        //cs-CZ,Vlasta,cs-CZ-VlastaNeural,Female
        actors.add(new TtsActor("cs-CZ-VlastaNeural", true, "一般"));
        actors.add(new TtsActor("cs-CZ-AntoninNeural", false, "一般"));
        //丹麥語（丹麥)
        //da-DK,Christel,da-DK-ChristelNeural,Female
        //da-DK,Jeppe,da-DK-JeppeNeural,Male
        actors.add(new TtsActor("da-DK-ChristelNeural", true, "一般"));
        actors.add(new TtsActor("da-DK-JeppeNeural", false, "一般"));
        //荷蘭語（比利時）
        //nl-BE,Arnaud,nl-BE-ArnaudNeural,Male
        //nl-BE,Dena,nl-BE-DenaNeural,Female
        actors.add(new TtsActor("nl-BE-DenaNeural", true, "一般"));
        actors.add(new TtsActor("nl-BE-ArnaudNeural", false, "一般"));
        //荷蘭語（荷蘭）
        //nl-NL,Colette,nl-NL-ColetteNeural,Female
        //nl-NL,Fenna,nl-NL-FennaNeural,Female
        //nl-NL,Maarten,nl-NL-MaartenNeural,Male
        actors.add(new TtsActor("nl-NL-ColetteNeural", true, "一般"));
        actors.add(new TtsActor("nl-NL-FennaNeural", true, "一般"));
        actors.add(new TtsActor("nl-NL-MaartenNeural", false, "一般"));


        //愛沙尼亞語(愛沙尼亞)
        //et-EE,Anu,et-EE-AnuNeural,Female
        //et-EE,Kert,et-EE-KertNeural,Male
        actors.add(new TtsActor("et-EE-AnuNeural", true, "一般"));
        actors.add(new TtsActor("et-EE-KertNeural", false, "一般"));
        //芬蘭語（芬蘭）
        //fi-FI,Harri,fi-FI-HarriNeural,Male
        //fi-FI,Noora,fi-FI-NooraNeural,Female
        //fi-FI,Selma,fi-FI-SelmaNeural,Female
        actors.add(new TtsActor("fi-FI-NooraNeural", true, "一般"));
        actors.add(new TtsActor("fi-FI-SelmaNeural", true, "一般"));
        actors.add(new TtsActor("fi-FI-HarriNeural", false, "一般"));
        //法語（比利時）
        //fr-BE,Charline,fr-BE-CharlineNeural,Female
        //fr-BE,Gerard,fr-BE-GerardNeural,Male
        actors.add(new TtsActor("fr-BE-CharlineNeural", true, "一般"));
        actors.add(new TtsActor("fr-BE-GerardNeural", false, "一般"));
        //法語（加拿大）
        //fr-CA,Antoine,fr-CA-AntoineNeural,Male
        //fr-CA,Jean,fr-CA-JeanNeural,Male
        //fr-CA,Sylvie,fr-CA-SylvieNeural,Female
        actors.add(new TtsActor("fr-CA-SylvieNeural", true, "一般"));
        actors.add(new TtsActor("fr-CA-AntoineNeural", false, "一般"));
        actors.add(new TtsActor("fr-CA-JeanNeural", false, "一般"));
        //法語（法國）
        //fr-FR,Denise,fr-FR-DeniseNeural,Female
        //fr-FR,Henri,fr-FR-HenriNeural,Male
        actors.add(new TtsActor("fr-FR-DeniseNeural", true, "一般"));
        actors.add(new TtsActor("fr-FR-HenriNeural", false, "一般"));
        //法語（瑞士）
        //fr-CH,Ariane,fr-CH-ArianeNeural,Female
        //fr-CH,Fabrice,fr-CH-FabriceNeural,Male
        actors.add(new TtsActor("fr-CH-ArianeNeural", true, "一般"));
        actors.add(new TtsActor("fr-CH-FabriceNeural", false, "一般"));
        //德語（奧地利）
        //de-AT,Ingrid,de-AT-IngridNeural,Female
        //de-AT,Jonas,de-AT-JonasNeural,Male
        actors.add(new TtsActor("de-AT-IngridNeural", true, "一般"));
        actors.add(new TtsActor("de-AT-JonasNeural", false, "一般"));
        //德語（德國）
        //de-DE,Conrad,de-DE-ConradNeural,Male
        //de-DE,Katja,de-DE-KatjaNeural,Female
        actors.add(new TtsActor("de-DE-KatjaNeural", true, "一般"));
        actors.add(new TtsActor("de-DE-ConradNeural", false, "一般"));
        //德語（瑞士）
        //de-CH,Jan,de-CH-JanNeural,Male
        //de-CH,Leni,de-CH-LeniNeural,Female
        actors.add(new TtsActor("de-CH-LeniNeural", true, "一般"));
        actors.add(new TtsActor("de-DE-ConradNeural", false, "一般"));
        //希臘語(希臘)
        //el-GR,Αθηνά,el-GR-AthinaNeural,Female
        //el-GR,Νέστορας,el-GR-NestorasNeural,Male
        actors.add(new TtsActor("el-GR-AthinaNeural", true, "一般"));
        actors.add(new TtsActor("el-GR-NestorasNeural", false, "一般"));
        //希伯來語（以色列）
        //he-IL,אברי,he-IL-AvriNeural,Male
        //he-IL,הילה,he-IL-HilaNeural,Female
        actors.add(new TtsActor("he-IL-HilaNeural", true, "一般"));
        actors.add(new TtsActor("he-IL-AvriNeural", false, "一般"));
        //印地語（印度）
        //hi-IN,मधुर,hi-IN-MadhurNeural,Male
        //hi-IN,स्वरा,hi-IN-SwaraNeural,Female
        actors.add(new TtsActor("hi-IN-SwaraNeural", true, "一般"));
        actors.add(new TtsActor("hi-IN-MadhurNeural", false, "一般"));
        //匈牙利語(匈牙利)
        //hu-HU,Noémi,hu-HU-NoemiNeural,Female
        //hu-HU,Tamás,hu-HU-TamasNeural,Male
        actors.add(new TtsActor("hu-HU-NoemiNeural", true, "一般"));
        actors.add(new TtsActor("hu-HU-TamasNeural", false, "一般"));
        //印度尼西亞語(印度尼西亞)
        //id-ID,Ardi,id-ID-ArdiNeural,Male
        //id-ID,Gadis,id-ID-GadisNeural,Female
        actors.add(new TtsActor("id-ID-GadisNeural", true, "一般"));
        actors.add(new TtsActor("id-ID-ArdiNeural", false, "一般"));
        //愛爾蘭語（愛爾蘭）
        //ga-IE,Colm,ga-IE-ColmNeural,Male
        //ga-IE,Orla,ga-IE-OrlaNeural,Female
        actors.add(new TtsActor("ga-IE-OrlaNeural", true, "一般"));
        actors.add(new TtsActor("ga-IE-ColmNeural", false, "一般"));
        //義大利語（義大利）
        //it-IT,Diego,it-IT-DiegoNeural,Male
        //it-IT,Elsa,it-IT-ElsaNeural,Female
        //it-IT,Isabella,it-IT-IsabellaNeural,Female
        actors.add(new TtsActor("it-IT-ElsaNeural", true, "一般"));
        actors.add(new TtsActor("it-IT-IsabellaNeural", true, "一般"));
        actors.add(new TtsActor("it-IT-DiegoNeural", false, "一般"));

        //拉脫維亞語(拉脫維亞)
        //lv-LV,Everita,lv-LV-EveritaNeural,Female
        //lv-LV,Nils,lv-LV-NilsNeural,Male
        actors.add(new TtsActor("lv-LV-EveritaNeural", true, "一般"));
        actors.add(new TtsActor("lv-LV-NilsNeural", false, "一般"));
        //立陶宛語(立陶宛)
        //lt-LT,Leonas,lt-LT-LeonasNeural,Male
        //lt-LT,Ona,lt-LT-OnaNeural,Female
        actors.add(new TtsActor("lt-LT-OnaNeural", true, "一般"));
        actors.add(new TtsActor("lt-LT-LeonasNeural", false, "一般"));
        //馬來語（馬來西亞）
        //ms-MY,Osman,ms-MY-OsmanNeural,Male
        //ms-MY,Yasmin,ms-MY-YasminNeural,Female
        actors.add(new TtsActor("ms-MY-YasminNeural", true, "一般"));
        actors.add(new TtsActor("ms-MY-OsmanNeural", false, "一般"));
        //馬耳他語（馬耳他）
        //mt-MT,Grace,mt-MT-GraceNeural,Female
        //mt-MT,Joseph,mt-MT-JosephNeural,Male
        actors.add(new TtsActor("mt-MT-GraceNeural", true, "一般"));
        actors.add(new TtsActor("mt-MT-JosephNeural", false, "一般"));
        //挪威語（博克馬爾語，挪威）
        //nb-NO,Finn,nb-NO-FinnNeural,Male
        //nb-NO,Iselin,nb-NO-IselinNeural,Female
        //nb-NO,Pernille,nb-NO-PernilleNeural,Female
        actors.add(new TtsActor("nb-NO-IselinNeural", true, "一般"));
        actors.add(new TtsActor("nb-NO-PernilleNeural", true, "一般"));
        actors.add(new TtsActor("nb-NO-FinnNeural", false, "一般"));
        //波蘭語（波蘭）
        //pl-PL,Agnieszka,pl-PL-AgnieszkaNeural,Female
        //pl-PL,Marek,pl-PL-MarekNeural,Male
        //pl-PL,Zofia,pl-PL-ZofiaNeural,Female
        actors.add(new TtsActor("pl-PL-AgnieszkaNeural", true, "一般"));
        actors.add(new TtsActor("pl-PL-MarekNeural", true, "一般"));
        actors.add(new TtsActor("pl-PL-MarekNeural", false, "一般"));
        //葡萄牙語（巴西）
        //pt-BR,Antônio,pt-BR-AntonioNeural,Male
        //pt-BR,Francisca,pt-BR-FranciscaNeural,Female
        actors.add(new TtsActor("pt-BR-FranciscaNeural", true, "一般，使用 SSML 提供多種語音風格"));
        actors.add(new TtsActor("pt-BR-AntonioNeural", false, "一般"));
        //葡萄牙語(葡萄牙)
        //pt-PT,Duarte,pt-PT-DuarteNeural,Male
        //pt-PT,Fernanda,pt-PT-FernandaNeural,Female
        //pt-PT,Raquel,pt-PT-RaquelNeural,Female
        actors.add(new TtsActor("pt-PT-FernandaNeural", true, "一般"));
        actors.add(new TtsActor("pt-PT-RaquelNeural", true, "一般"));
        actors.add(new TtsActor("pt-PT-DuarteNeural", false, "一般"));
        //羅馬尼亞語(羅馬尼亞)
        //ro-RO,Alina,ro-RO-AlinaNeural,Female
        //ro-RO,Emil,ro-RO-EmilNeural,Male
        actors.add(new TtsActor("ro-RO-AlinaNeural", true, "一般"));
        actors.add(new TtsActor("ro-RO-EmilNeural", false, "一般"));

        //斯洛伐克語(斯洛伐克)
        //sk-SK,Lukáš,sk-SK-LukasNeural,Male
        //sk-SK,Viktória,sk-SK-ViktoriaNeural,Female
        actors.add(new TtsActor("sk-SK-ViktoriaNeural", true, "一般"));
        actors.add(new TtsActor("sk-SK-LukasNeural", false, "一般"));
        //斯洛維尼亞語(斯洛維尼亞)
        //sl-SI,Petra,sl-SI-PetraNeural,Female
        //sl-SI,Rok,sl-SI-RokNeural,Male
        actors.add(new TtsActor("sl-SI-PetraNeural", true, "一般"));
        actors.add(new TtsActor("sl-SI-RokNeural", false, "一般"));
        //西班牙語（墨西哥）
        //es-MX,Dalia,es-MX-DaliaNeural,Female
        //es-MX,Jorge,es-MX-JorgeNeural,Male
        actors.add(new TtsActor("es-MX-DaliaNeural", true, "一般"));
        actors.add(new TtsActor("es-MX-JorgeNeural", false, "一般"));
        //西班牙語(西班牙)
        //es-ES,Elvira,es-ES-ElviraNeural,Female
        //es-ES,Álvaro,es-ES-AlvaroNeural,Male
        actors.add(new TtsActor("es-ES-ElviraNeural", true, "一般"));
        actors.add(new TtsActor("es-ES-AlvaroNeural", false, "一般"));
        //西班牙語（美國）
        //es-US,Alonso,es-US-AlonsoNeural,Male
        //es-US,Paloma,es-US-PalomaNeural,Female
        actors.add(new TtsActor("es-US-AlonsoNeural", true, "一般"));
        actors.add(new TtsActor("es-US-PalomaNeural", false, "一般"));
        //西班牙語（阿根廷）
        //es-AR,Elena,es-AR-ElenaNeural,Female
        //es-AR,Tomas,es-AR-TomasNeural,Male
        actors.add(new TtsActor("es-AR-ElenaNeural", true, "一般"));
        actors.add(new TtsActor("es-AR-TomasNeural", false, "一般"));
        //西班牙語（哥倫比亞）
        //es-CO,Gonzalo,es-CO-GonzaloNeural,Male
        //es-CO,Salome,es-CO-SalomeNeural,Female
        actors.add(new TtsActor("es-CO-SalomeNeural", true, "一般"));
        actors.add(new TtsActor("es-CO-GonzaloNeural", false, "一般"));
        //瑞典語（瑞典）
        //sv-SE,Hillevi,sv-SE-HilleviNeural,Female
        //sv-SE,Mattias,sv-SE-MattiasNeural,Male
        //sv-SE,Sofie,sv-SE-SofieNeural,Female
        actors.add(new TtsActor("sv-SE-HilleviNeural", true, "一般"));
        actors.add(new TtsActor("sv-SE-SofieNeural", true, "一般"));
        actors.add(new TtsActor("sv-SE-MattiasNeural", false, "一般"));
        //泰米爾語（印度）
        //ta-IN,பல்லவி,ta-IN-PallaviNeural,Female
        //ta-IN,வள்ளுவர்,ta-IN-ValluvarNeural,Male
        actors.add(new TtsActor("ta-IN-PallaviNeural", true, "一般"));
        actors.add(new TtsActor("ta-IN-ValluvarNeural", false, "一般"));
        //古吉拉特語（印度）
        //gu-IN,ધ્વની,gu-IN-DhwaniNeural,Female
        //gu-IN,નિરંજન,gu-IN-NiranjanNeural,Male
        actors.add(new TtsActor("gu-IN-DhwaniNeural", true, "一般"));
        actors.add(new TtsActor("gu-IN-NiranjanNeural", false, "一般"));
        //泰盧固語（印度）
        //te-IN,మోహన్,te-IN-MohanNeural,Male
        //te-IN,శ్రుతి,te-IN-ShrutiNeural,Female
        actors.add(new TtsActor("te-IN-ShrutiNeural", true, "一般"));
        actors.add(new TtsActor("te-IN-MohanNeural", false, "一般"));
        //馬拉地語（印度）
        //mr-IN,आरोही,mr-IN-AarohiNeural,Female
        //mr-IN,मनोहर,mr-IN-ManoharNeural,Male
        actors.add(new TtsActor("mr-IN-AarohiNeural", true, "一般"));
        actors.add(new TtsActor("mr-IN-ManoharNeural", false, "一般"));
        //泰語（泰國）
        //th-TH,นิวัฒน์,th-TH-NiwatNeural,Male
        //th-TH,อัจฉรา,th-TH-AcharaNeural,Female
        //th-TH,เปรมวดี,th-TH-PremwadeeNeural,Female
        actors.add(new TtsActor("th-TH-AcharaNeural", true, "一般"));
        actors.add(new TtsActor("th-TH-PremwadeeNeural", true, "一般"));
        actors.add(new TtsActor("th-TH-NiwatNeural", false, "一般"));
        //土耳其語（土耳其）
        //tr-TR,Ahmet,tr-TR-AhmetNeural,Male
        //tr-TR,Emel,tr-TR-EmelNeural,Female
        actors.add(new TtsActor("tr-TR-EmelNeural", true, "一般"));
        actors.add(new TtsActor("tr-TR-AhmetNeural", false, "一般"));
        //烏克蘭語(烏克蘭)
        //uk-UA,Остап,uk-UA-OstapNeural,Male
        //uk-UA,Поліна,uk-UA-PolinaNeural,Female
        actors.add(new TtsActor("uk-UA-PolinaNeural", true, "一般"));
        actors.add(new TtsActor("uk-UA-OstapNeural", false, "一般"));
        //烏爾都語（巴基斯坦）
        //ur-PK,اسد,ur-PK-AsadNeural,Male
        //ur-PK,عظمیٰ,ur-PK-UzmaNeural,Female
        actors.add(new TtsActor("ur-PK-UzmaNeural", true, "一般"));
        actors.add(new TtsActor("ur-PK-AsadNeural", false, "一般"));
        //越南語(越南)
        //vi-VN,Hoài My,vi-VN-HoaiMyNeural,Female
        //vi-VN,Nam Minh,vi-VN-NamMinhNeural,Male
        actors.add(new TtsActor("vi-VN-HoaiMyNeural", true, "一般"));
        actors.add(new TtsActor("vi-VN-NamMinhNeural", false, "一般"));
        //威爾斯語（英國）
        //cy-GB,Aled,cy-GB-AledNeural,Male
        //cy-GB,Nia,cy-GB-NiaNeural,Female
        actors.add(new TtsActor("cy-GB-NiaNeural", true, "一般"));
        actors.add(new TtsActor("cy-GB-AledNeural", false, "一般"));
        //立陶宛語（立陶宛）
        //lt-LT,Leonas,lt-LT-LeonasNeural,Male
        //lt-LT,Ona,lt-LT-OnaNeural,Female
        actors.add(new TtsActor("lt-LT-OnaNeural", true, "一般"));
        actors.add(new TtsActor("lt-LT-LeonasNeural", false, "一般"));
        //斯瓦希里語（肯亞）
        //sw-KE,Rafiki,sw-KE-RafikiNeural,Male
        //sw-KE,Zuri,sw-KE-ZuriNeural,Female
        actors.add(new TtsActor("sw-KE-ZuriNeural", true, "一般"));
        actors.add(new TtsActor("sw-KE-RafikiNeural", false, "一般"));
        Log.d(TAG, actors.size() + "");



    }

    public List<TtsActor> sortByLocale(List<TtsActor> list, Locale locale) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Collections.sort(list, (o1, o2) -> {
                Locale loc1 = o1.getLocale();
                Locale loc2 = o2.getLocale();
                boolean b11 = loc1.getISO3Language().equals(locale.getISO3Language());
                boolean b12 = loc1.getISO3Country().equals(locale.getISO3Country());
                boolean b13 = loc1.getDisplayVariant(Locale.US).equals(locale.getDisplayVariant(Locale.US));
                boolean b21 = loc2.getISO3Language().equals(locale.getISO3Language());
                boolean b22 = loc2.getISO3Country().equals(locale.getISO3Country());
                boolean b23 = loc2.getDisplayVariant(Locale.US).equals(locale.getDisplayVariant(Locale.US));
                //语言都不同
                if ((!b11) && (!b21)) {
                    return 0;
                }
                //两个都相同
                if (b11 && b12 && b13 == b21 && b22 && b23) {
                    return 0;
                }
                if (b11 && b12 && b13) {
                    return -1;
                }
                if (b21 && b22 && b23) {
                    return 1;
                }

                if ((b11 && b12 == b21 && b22)) {
                    if (b13 == b23) {
                        return 0;
                    }
                    if (b13) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                if (b11 && b12) {
                    return -1;
                }
                if (b21 && b22) {
                    return 1;
                }
                return 0;
            });
        }
        return list;
    }

    @Nullable
    public TtsActor getByName(@NonNull String name) {
        for (TtsActor actor : actors) {
            if (actor.getShortName().equalsIgnoreCase(name) || actor.getName().equalsIgnoreCase(name)) {
                return actor;
            }
        }

        return null;
    }

    /**
     * 获取所有Actor
     *
     * @return List<TtsActor>
     */
    @SuppressWarnings("unused")
    public synchronized List<TtsActor> getActors() {

        return sortByLocale(this.actors, Locale.getDefault());
        //return this.actors;
    }

    /**
     * 获取当前Locale支持的Actor
     *
     * @param locale locale
     * @return List<TtsActor>
     */
    @SuppressWarnings("unused")
    public List<TtsActor> getActorsByLocale(Locale locale) {
        List<TtsActor> newActors = new ArrayList<>();
        for (TtsActor actor : actors) {
            //语言相同或者地区相同
            if (actor.getLocale().getISO3Language().equals(locale.getISO3Language()) || actor.getLocale().getISO3Country().equals(locale.getISO3Country())) {
                newActors.add(actor);
            }
        }
        sortByLocale(newActors, locale);
        return newActors;
    }

//    public List<Locale> getAllSupportIOS() {
//


}
