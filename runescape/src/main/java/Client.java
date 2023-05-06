import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public final class Client extends class35 implements class402, OAuthApi {
	protected static boolean field3732;
	protected static String field270;
	public static boolean field1459;
	public static boolean field492;
	public static boolean[] field3037;
	public static class208 field722;
	public static class299 field4942;
	public static class303 field2382;
	public static class317[][] field2057;
	public static class344 field3385;
	public static class344 field3386;
	public static class344 field3387;
	public static class344 field3388;
	public static class46 field3390;
	public static class472[] field4375;
	public static int field1063;
	public static int field1324;
	public static int field1789;
	public static int field1833;
	public static int field1838;
	public static int field1909;
	public static int field1913;
	public static int field4411;
	public static int field577;
	public static int field579;
	public static int field682;
	public static int field782;
	public static File field3832;
	public static File field5152;
	public static String field2000;
	public static String field4339;
	public static final class107 field753;
	static Client field466;
	static boolean field1025;
	static boolean field493;
	static boolean field4941;
	static boolean field500;
	static boolean field506;
	static boolean field518;
	static boolean field540;
	static boolean field553;
	static boolean field562;
	static boolean field570;
	static boolean field586;
	static boolean field604;
	static boolean field610;
	static boolean field615;
	static boolean field631;
	static boolean field642;
	static boolean field643;
	static boolean field644;
	static boolean field651;
	static boolean field666;
	static boolean field669;
	static boolean field673;
	static boolean field674;
	static boolean field689;
	static boolean field696;
	static boolean field715;
	static boolean field724;
	static boolean field732;
	static boolean field739;
	static boolean field746;
	static boolean field748;
	static boolean field749;
	static boolean field756;
	static boolean field757;
	static boolean field865;
	static boolean[] field588;
	static boolean[] field641;
	static boolean[] field652;
	static boolean[] field706;
	static boolean[] field707;
	static boolean[] field754;
	static byte[] field536;
	static byte[][] field11;
	static byte[][] field834;
	static class105 field4387;
	static class108 field78;
	static class136 field527;
	static class151 field2269;
	static class151[] field750;
	static class160 field253;
	static class160[] field679;
	static class171 field1489;
	static class177 field2974;
	static class177 field5;
	static class206 field723;
	static class209[] field561;
	static class223 field180;
	static class280 field779;
	static class280 field780;
	static class314 field772;
	static class317 field1575;
	static class317 field3394;
	static class317 field511;
	static class317 field539;
	static class317 field661;
	static class317 field667;
	static class317 field672;
	static class317[] field2878;
	static class332 field2612;
	static class333 field491;
	static class342 field1064;
	static class342 field1069;
	static class342 field118;
	static class342 field1532;
	static class342 field1568;
	static class342 field159;
	static class342 field1828;
	static class342 field2098;
	static class342 field2102;
	static class342 field2336;
	static class342 field2684;
	static class342 field2869;
	static class342 field317;
	static class342 field3804;
	static class342 field4217;
	static class342 field4271;
	static class342 field4300;
	static class342 field4548;
	static class342 field4688;
	static class342 field4788;
	static class353[] field776;
	static class363 field551;
	static class363 field574;
	static class363 field627;
	static class363 field699;
	static class363 field700;
	static class363 field701;
	static class363 field702;
	static class363[][][] field624;
	static class379 field1635;
	static class379 field2832;
	static class379 field4327;
	static class389 field516;
	static class39 field1574;
	static class399 field742;
	static class40[] field745;
	static class414 field1957;
	static class414 field3825;
	static class418 field3036;
	static class43 field163;
	static class43 field1997;
	static class430 field1340;
	static class451 field1437;
	static class452 field616;
	static class455 field738;
	static class455 field751;
	static class456 field668;
	static class459 field1542;
	static class465 field657;
	static class465 field703;
	static class469 field889;
	static class474 field1781;
	static class474 field882;
	static class494 field528;
	static class502[] field1265;
	static class502[] field3826;
	static class503 field1233;
	static class503 field1396;
	static class503 field994;
	static class503[] field1348;
	static class503[] field1861;
	static class503[] field1959;
	static class503[] field256;
	static class503[] field4669;
	static class503[] field4946;
	static class503[] field734;
	static class507 field698;
	static class56 field2981;
	static class63 field513;
	static class70 field4318;
	static class74 field541;
	static class85 field1449;
	static class88 field3454;
	static class88[] field611;
	static class94 field112;
	static class96[] field546;
	static class99 field501;
	static class99 field517;
	static int field1020;
	static int field1024;
	static int field1042;
	static int field1083;
	static int field119;
	static int field1289;
	static int field1297;
	static int field13;
	static int field1329;
	static int field1345;
	static int field138;
	static int field1500;
	static int field1531;
	static int field1566;
	static int field1638;
	static int field165;
	static int field1675;
	static int field1678;
	static int field1693;
	static int field1867;
	static int field1872;
	static int field1903;
	static int field1938;
	static int field194;
	static int field1958;
	static int field2065;
	static int field231;
	static int field2331;
	static int field257;
	static int field2685;
	static int field28;
	static int field2805;
	static int field2841;
	static int field2850;
	static int field2975;
	static int field2985;
	static int field3007;
	static int field3040;
	static int field3365;
	static int field3391;
	static int field4214;
	static int field44;
	static int field4479;
	static int field4569;
	static int field4601;
	static int field4672;
	static int field470;
	static int field4753;
	static int field487;
	static int field488;
	static int field4883;
	static int field4885;
	static int field489;
	static int field490;
	static int field494;
	static int field495;
	static int field496;
	static int field498;
	static int field499;
	static int field503;
	static int field504;
	static int field505;
	static int field507;
	static int field508;
	static int field509;
	static int field510;
	static int field512;
	static int field514;
	static int field515;
	static int field519;
	static int field520;
	static int field521;
	static int field522;
	static int field524;
	static int field525;
	static int field526;
	static int field530;
	static int field531;
	static int field545;
	static int field547;
	static int field549;
	static int field555;
	static int field558;
	static int field559;
	static int field560;
	static int field565;
	static int field566;
	static int field568;
	static int field569;
	static int field571;
	static int field572;
	static int field575;
	static int field576;
	static int field578;
	static int field580;
	static int field582;
	static int field583;
	static int field584;
	static int field589;
	static int field590;
	static int field591;
	static int field595;
	static int field596;
	static int field600;
	static int field601;
	static int field602;
	static int field606;
	static int field607;
	static int field609;
	static int field612;
	static int field613;
	static int field617;
	static int field619;
	static int field622;
	static int field623;
	static int field625;
	static int field626;
	static int field628;
	static int field633;
	static int field645;
	static int field646;
	static int field647;
	static int field648;
	static int field649;
	static int field650;
	static int field653;
	static int field654;
	static int field656;
	static int field658;
	static int field659;
	static int field660;
	static int field664;
	static int field665;
	static int field670;
	static int field671;
	static int field675;
	static int field676;
	static int field677;
	static int field678;
	static int field680;
	static int field681;
	static int field683;
	static int field684;
	static int field686;
	static int field688;
	static int field690;
	static int field691;
	static int field692;
	static int field693;
	static int field697;
	static int field704;
	static int field705;
	static int field708;
	static int field711;
	static int field713;
	static int field717;
	static int field72;
	static int field721;
	static int field726;
	static int field729;
	static int field730;
	static int field731;
	static int field735;
	static int field737;
	static int field747;
	static int field752;
	static int field758;
	static int field761;
	static int field763;
	static int field765;
	static int field766;
	static int field767;
	static int field768;
	static int field769;
	static int field770;
	static int field771;
	static int field773;
	static int field774;
	static int field778;
	static int field781;
	static int field785;
	static int field91;
	static int field958;
	static int[] field3064;
	static int[] field3723;
	static int[] field4199;
	static int[] field4877;
	static int[] field548;
	static int[] field550;
	static int[] field556;
	static int[] field557;
	static int[] field567;
	static int[] field585;
	static int[] field587;
	static int[] field592;
	static int[] field593;
	static int[] field594;
	static int[] field597;
	static int[] field603;
	static int[] field608;
	static int[] field618;
	static int[] field620;
	static int[] field629;
	static int[] field630;
	static int[] field632;
	static int[] field634;
	static int[] field635;
	static int[] field636;
	static int[] field637;
	static int[] field638;
	static int[] field640;
	static int[] field685;
	static int[] field687;
	static int[] field694;
	static int[] field709;
	static int[] field710;
	static int[] field712;
	static int[] field716;
	static int[] field720;
	static int[] field725;
	static int[] field733;
	static int[] field740;
	static int[] field741;
	static int[] field743;
	static int[] field744;
	static int[] field755;
	static int[] field777;
	static int[] field788;
	static int[] field789;
	static int[][] field2848;
	static int[][] field535;
	static int[][][] field563;
	static String field1319;
	static String field1404;
	static String field1420;
	static String field1472;
	static String field2775;
	static String field3476;
	static String field4348;
	static String field497;
	static String field655;
	static String field663;
	static String field719;
	static String[] field581;
	static String[] field599;
	static String[] field639;
	static String[] field736;
	static SecureRandom field1870;
	static ArrayList field784;
	static HashMap field718;
	static List field783;
	static long field1581;
	static long field4288;
	static long field502;
	static long field605;
	static long field614;
	static long field714;
	static long field727;
	static long[] field786;
	static short field573;
	static short field621;
	static short field695;
	static short field759;
	static short field760;
	static short field762;
	static short field764;
	static short field775;
	static short[] field4549;
	static final class62 field787;
	static final int[] field564;
	static final int[] field598;
	static final String field538;
	boolean field534;
	class15 field662;
	class19 field523;
	class19 field543;
	class489 field542;
	class8 field554;
	OtlTokenRequester field532;
	RefreshAccessTokenRequester field552;
	String field529;
	Future field533;
	Future field537;
	long field544;

	static {
		field604 = true;
		field579 = 1;
		field489 = 0;
		field490 = 0;
		field492 = false;
		field493 = false;
		field494 = -1;
		field495 = -1;
		field496 = -1;
		field562 = false;
		field498 = 213;
		field499 = 0;
		field500 = true;
		field602 = 0;
		field502 = -1L;
		field503 = -1;
		field504 = -1;
		field605 = -1L;
		field506 = true;
		field545 = 0;
		field508 = 0;
		field509 = 0;
		field510 = 0;
		field654 = 0;
		field512 = 0;
		field547 = 0;
		field766 = 0;
		field705 = 0;
		field501 = class99.field1309;
		field517 = class99.field1309;
		field518 = false;
		field519 = 0;
		field520 = 0;
		field521 = 0;
		field522 = 0;
		field765 = 0;
		field524 = 0;
		field525 = 0;
		field526 = 0;
		field527 = class136.field1622;
		field528 = class494.field5049;
		field538 = class371.method5231(class314.method5843("com_jagex_auth_desktop_osrs:public", (byte)-35));
		field540 = false;
		field541 = new class74();
		field536 = null;
		field546 = new class96[65536];
		field737 = 0;
		field548 = new int[65536];
		field549 = 0;
		field550 = new int[250];
		field753 = new class107();
		field761 = 0;
		field553 = false;
		field516 = new class389();
		field718 = new HashMap();
		field560 = 0;
		field726 = 1;
		field558 = 0;
		field559 = 1;
		field622 = 0;
		field561 = new class209[4];
		field689 = false;
		field563 = new int[4][13][13];
		field564 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field565 = 0;
		field576 = 2301979;
		field584 = 5063219;
		field568 = 3353893;
		field569 = 7759444;
		field570 = false;
		field571 = 0;
		field595 = 128;
		field758 = 0;
		field704 = 0;
		field575 = 0;
		field580 = 0;
		field681 = 0;
		field505 = 0;
		field771 = 50;
		field778 = 0;
		field729 = 0;
		field531 = 0;
		field583 = 12;
		field711 = 6;
		field577 = 0;
		field586 = false;
		field619 = 0;
		field757 = false;
		field589 = 0;
		field590 = 0;
		field591 = 50;
		field592 = new int[field591];
		field593 = new int[field591];
		field594 = new int[field591];
		field608 = new int[field591];
		field587 = new int[field591];
		field597 = new int[field591];
		field567 = new int[field591];
		field599 = new String[field591];
		field535 = new int[104][104];
		field601 = 0;
		field708 = -1;
		field572 = -1;
		field515 = 0;
		field676 = 0;
		field606 = 0;
		field607 = 0;
		field696 = true;
		field609 = 0;
		field610 = true;
		field611 = new class88[2048];
		field664 = -1;
		field613 = 0;
		field614 = -1L;
		field615 = true;
		field612 = 0;
		field617 = 0;
		field618 = new int[1000];
		field598 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		field736 = new String[8];
		field588 = new boolean[8];
		field694 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		field623 = -1;
		field624 = new class363[4][104][104];
		field574 = new class363();
		field551 = new class363();
		field627 = new class363();
		field743 = new int[25];
		field629 = new int[25];
		field630 = new int[25];
		field631 = false;
		field669 = false;
		field633 = 0;
		field634 = new int[500];
		field635 = new int[500];
		field636 = new int[500];
		field637 = new int[500];
		field638 = new int[500];
		field639 = new String[500];
		field581 = new String[500];
		field641 = new boolean[500];
		field642 = false;
		field643 = false;
		field644 = true;
		field645 = -1;
		field646 = -1;
		field647 = 0;
		field648 = 50;
		field649 = 0;
		field497 = null;
		field651 = false;
		field658 = -1;
		field600 = -1;
		field663 = null;
		field655 = null;
		field656 = -1;
		field657 = new class465(8);
		field596 = 0;
		field659 = -1;
		field626 = 0;
		field661 = null;
		field625 = 0;
		field683 = 0;
		field682 = 0;
		field665 = -1;
		field666 = false;
		field667 = null;
		field511 = null;
		field539 = null;
		field670 = 0;
		field671 = 0;
		field672 = null;
		field673 = false;
		field628 = -1;
		field675 = -1;
		field756 = false;
		field677 = -1;
		field678 = -1;
		field724 = false;
		field680 = 1;
		field740 = new int[32];
		field514 = 0;
		field720 = new int[32];
		field684 = 0;
		field685 = new int[32];
		field686 = 0;
		field687 = new int[32];
		field688 = 0;
		field752 = 0;
		field690 = 0;
		field691 = 0;
		field692 = 0;
		field693 = 0;
		field763 = 0;
		field769 = 0;
		field566 = 0;
		field697 = 0;
		field698 = new class507();
		field699 = new class363();
		field700 = new class363();
		field701 = new class363();
		field702 = new class363();
		field703 = new class465(512);
		field781 = 0;
		field660 = -2;
		field706 = new boolean[100];
		field707 = new boolean[100];
		field652 = new boolean[100];
		field709 = new int[100];
		field710 = new int[100];
		field640 = new int[100];
		field712 = new int[100];
		field713 = 0;
		field714 = 0L;
		field715 = true;
		field716 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field717 = 0;
		field578 = 0;
		field719 = "";
		field786 = new long[100];
		field721 = 0;
		field722 = new class208();
		field723 = new class206();
		field488 = 0;
		field725 = new int[128];
		field557 = new int[128];
		field727 = -1L;
		field750 = new class151[4];
		field679 = new class160[4];
		field730 = -1;
		field731 = 0;
		field620 = new int[1000];
		field733 = new int[1000];
		field734 = new class503[1000];
		field735 = 0;
		field487 = 0;
		field653 = 0;
		field650 = -1;
		field739 = false;
		field507 = 0;
		field741 = new int[50];
		field603 = new int[50];
		field556 = new int[50];
		field744 = new int[50];
		field745 = new class40[50];
		field746 = false;
		field674 = false;
		field748 = false;
		field749 = false;
		field668 = null;
		field751 = null;
		field738 = null;
		field732 = false;
		field754 = new boolean[5];
		field755 = new int[5];
		field777 = new int[5];
		field632 = new int[5];
		field585 = new int[5];
		field759 = 256;
		field760 = 205;
		field775 = 256;
		field762 = 320;
		field573 = 1;
		field764 = 32767;
		field621 = 1;
		field695 = 32767;
		field555 = 0;
		field768 = 0;
		field767 = 0;
		field770 = 0;
		field582 = 0;
		field772 = new class314();
		field773 = -1;
		field774 = -1;
		field616 = new class450();
		field776 = new class353[8];
		field513 = new class63();
		field742 = new class399(8, class397.field4533);
		field779 = new class280(64);
		field780 = new class280(64);
		field747 = -1;
		field782 = -1;
		field783 = new ArrayList();
		field784 = new ArrayList(10);
		field785 = 0;
		field530 = 0;
		field787 = new class62();
		field788 = new int[50];
		field789 = new int[50];
	}

	public Client() {
		this.field534 = false;
		this.field544 = -1L;
	}

	protected final void method553() {
	}

	public final void init() {
		if (this.method533()) {
			int var3;
			for (int var1 = 0; var1 <= 28; ++var1) {
				String var2 = this.getParameter(Integer.toString(var1));
				if (null != var2) {
					switch(var1) {
					case 3:
						if (var2.equalsIgnoreCase(class97.field1285)) {
							field492 = true;
						} else {
							field492 = false;
						}
						break;
					case 4:
						if (field495 == -1) {
							field495 = Integer.parseInt(var2);
						}
						break;
					case 5:
						field489 = Integer.parseInt(var2);
						break;
					case 6:
						class67.field1736 = class359.method6677(Integer.parseInt(var2), (byte)-1);
						break;
					case 7:
						field2612 = class332.method3188(Integer.parseInt(var2));
						break;
					case 8:
						if (var2.equalsIgnoreCase(class97.field1285)) {
						}
						break;
					case 9:
						field1404 = var2;
						break;
					case 10:
						field491 = (class333)class199.method3788(class333.method3437(), Integer.parseInt(var2));
						if (field491 == class333.field3807) {
							field889 = class469.field4909;
						} else {
							field889 = class469.field4915;
						}
						break;
					case 11:
						field2775 = var2;
						break;
					case 12:
						field579 = Integer.parseInt(var2);
					case 13:
					case 16:
					case 18:
					case 19:
					case 20:
					case 22:
					case 23:
					case 24:
					default:
						break;
					case 14:
						field4601 = Integer.parseInt(var2);
						break;
					case 15:
						field490 = Integer.parseInt(var2);
						break;
					case 17:
						class103.field4295 = var2;
						break;
					case 21:
						field494 = Integer.parseInt(var2);
						break;
					case 25:
						var3 = var2.indexOf(".");
						if (var3 == -1) {
							field498 = Integer.parseInt(var2);
						} else {
							field498 = Integer.parseInt(var2.substring(0, var3));
							Integer.parseInt(var2.substring(var3 + 1));
						}
					}
				}
			}

			class223.field2551 = false;
			field493 = false;
			field1420 = this.getCodeBase().getHost();
			String var16 = field2612.field3803;
			byte var17 = 0;

			try {
				field1833 = 22;
				field1838 = var17;

				try {
					field4339 = System.getProperty("os.name");
				} catch (Exception var14) {
					field4339 = "Unknown";
				}

				class450.field2982 = field4339.toLowerCase();

				try {
					field2000 = System.getProperty("user.home");
					if (null != field2000) {
						field2000 = field2000 + "/";
					}
				} catch (Exception var13) {
				}

				try {
					if (class450.field2982.startsWith("win")) {
						if (field2000 == null) {
							field2000 = System.getenv("USERPROFILE");
						}
					} else if (field2000 == null) {
						field2000 = System.getenv("HOME");
					}

					if (null != field2000) {
						field2000 = field2000 + "/";
					}
				} catch (Exception var12) {
				}

				if (field2000 == null) {
					field2000 = "~/";
				}

				class170.field1577 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2000, "/tmp/", ""};
				class170.field1292 = new String[]{".jagex_cache_" + field1838, ".file_store_" + field1838};

				label153:
				for (var3 = 0; var3 < 4; ++var3) {
					field3832 = class151.method3263("oldschool", var16, var3);
					if (!field3832.exists()) {
						field3832.mkdirs();
					}

					File[] var4 = field3832.listFiles();
					if (null == var4) {
						break;
					}

					File[] var5 = var4;
					int var6 = 0;

					while (true) {
						if (var6 >= var5.length) {
							break label153;
						}

						File var7 = var5[var6];

						boolean var8;
						try {
							RandomAccessFile var9 = new RandomAccessFile(var7, "rw");
							int var10 = var9.read();
							var9.seek(0L);
							var9.write(var10);
							var9.seek(0L);
							var9.close();
							var8 = true;
						} catch (Exception var11) {
							var8 = false;
						}

						if (!var8) {
							break;
						}

						++var6;
					}
				}

				File var18 = field3832;
				field5152 = var18;
				if (!field5152.exists()) {
					throw new RuntimeException("");
				}

				class172.field1842 = true;
				class170.method2166();
				class170.field1836 = new class472(new class471(class139.method3144("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
				class170.field1841 = new class472(new class471(class139.method3144("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
				field4375 = new class472[field1833];

				for (int var20 = 0; var20 < field1833; ++var20) {
					field4375[var20] = new class472(new class471(class139.method3144("main_file_cache.idx" + var20), "rw", 1048576L), 6000, 0);
				}
			} catch (Exception var15) {
				class388.method7339((String)null, var15);
			}

			field466 = this;
			class516.field5157 = field495;
			field4348 = System.getenv("JX_ACCESS_TOKEN");
			field1319 = System.getenv("JX_REFRESH_TOKEN");
			field3476 = System.getenv("JX_SESSION_ID");
			field1472 = System.getenv("JX_CHARACTER_ID");
			String var19 = System.getenv("JX_DISPLAY_NAME");
			class72.field912 = class470.method470(var19);
			if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
				this.field534 = true;
			}

			if (-1 == field496) {
				if (!this.method1410() && !this.method1235()) {
					field496 = 0;
				} else {
					field496 = 5;
				}
			}

			this.method613(765, 503, 213, 1);
		}
	}

	boolean method1410() {
		return null != field4348 && !field4348.trim().isEmpty() && field1319 != null && !field1319.trim().isEmpty();
	}

	boolean method1235() {
		return null != field3476 && !field3476.trim().isEmpty() && null != field1472 && !field1472.trim().isEmpty();
	}

	boolean method1236() {
		return null != this.field532;
	}

	void method1237(String var1) throws IOException {
		HashMap var3 = new HashMap();
		var3.put("grant_type", "refresh_token");
		var3.put("scope", "gamesso.token.create");
		var3.put("refresh_token", var1);
		URL var4 = new URL(field2775 + "shield/oauth/token" + (new class439(var3)).method8019());
		class395 var5 = new class395();
		var5.method7384(field538);
		var5.method7366("Host", (new URL(field2775)).getHost());
		var5.method7373(class436.field4704);
		class10 var6 = class10.field46;
		RefreshAccessTokenRequester var7 = this.field552;
		if (null != var7) {
			this.field537 = var7.request(var6.method72(), var4, var5.method7365(), "");
		} else {
			class11 var8 = new class11(var4, var6, var5, this.field534);
			this.field543 = this.field662.method180(var8);
		}
	}

	void method1605(String var1) throws IOException {
		URL var3 = new URL(field2775 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class395 var4 = new class395();
		var4.method7370(var1);
		class10 var5 = class10.field40;
		OtlTokenRequester var6 = this.field532;
		if (null != var6) {
			this.field533 = var6.request(var5.method72(), var3, var4.method7365(), "");
		} else {
			class11 var7 = new class11(var3, var5, var4, this.field534);
			this.field523 = this.field662.method180(var7);
		}
	}

	void method1239(String var1, String var2) throws IOException, JSONException {
		URL var4 = new URL(field2775 + "/game-session/v1/tokens");
		class11 var5 = new class11(var4, class10.field46, this.field534);
		var5.method85().method7370(var1);
		var5.method85().method7373(class436.field4704);
		JSONObject var6 = new JSONObject();
		var6.put("accountId", var2);
		var5.method98(new class438(var6));
		this.field523 = this.field662.method180(var5);
	}

	protected final void method550() {
		class387.method3118(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		field4569 = 0 == field490 ? 43594 : 40000 + field579;
		field1566 = 0 == field490 ? 443 : 50000 + field579;
		field1024 = field4569;
		class314.field3518 = class316.field3551;
		class314.field3508 = class316.field3550;
		class314.field2957 = class316.field3552;
		class314.field4708 = class316.field3553;
		field78 = new class109(this.field534, 213);
		this.method522();
		this.method650();
		field1489 = this.method518();
		this.method524(field723, 0);
		this.method524(field722, 1);
		field3036 = new class418(255, class170.field1836, class170.field1841, 500000);
		field112 = class206.method4062();
		this.method644();
		String var3 = field270;
		class32.field175 = this;
		if (var3 != null) {
			class32.field176 = var3;
		}

		class56.method1134(field112.method2415());
		class67.field804 = new class65(field889);
		this.field662 = new class15("tokenRequest", 1, 1);
	}

	protected final void method538() {
		++field602;
		this.method1240();

		while (true) {
			class363 var3;
			synchronized(var3 = class341.field4196){}
			class340 var2 = (class340)class341.field4195.method6714();
			if (null == var2) {
				int var7;
				try {
					if (1 == class298.field3389) {
						var7 = field4942.method5655();
						if (var7 > 0 && field4942.method5575()) {
							var7 -= field1789;
							if (var7 < 0) {
								var7 = 0;
							}

							field4942.method5568(var7);
						} else {
							field4942.method5574();
							field4942.method5572();
							if (field3388 != null) {
								class298.field3389 = 2;
							} else {
								class298.field3389 = 0;
							}

							field2382 = null;
							field3390 = null;
						}
					}
				} catch (Exception var6) {
					var6.printStackTrace();
					field4942.method5574();
					class298.field3389 = 0;
					field2382 = null;
					field3390 = null;
					field3388 = null;
				}

				method6316();
				field722.method4068();
				this.method541();
				class36 var8;
				synchronized(var8 = class36.field235){}
				class36.field232 = class36.field237;
				class36.field242 = class36.field238;
				class36.field243 = class36.field245;
				class36.field246 = class36.field241;
				class36.field252 = class36.field244;
				class36.field250 = class36.field236;
				class36.field251 = class36.field247;
				class36.field249 = class36.field248;
				class36.field244 = 0;
				if (field1489 != null) {
					var7 = field1489.method3449();
					field697 = var7;
				}

				if (field499 == 0) {
					class23.method319();
					class96.method2569();
				} else if (field499 == 5) {
					class188.method3622(this, field4327, field2832);
					class23.method319();
					class96.method2569();
				} else if (10 != field499 && 11 != field499) {
					if (field499 == 20) {
						class188.method3622(this, field4327, field2832);
						this.method1243();
					} else if (field499 == 50) {
						class188.method3622(this, field4327, field2832);
						this.method1243();
					} else if (field499 == 25) {
						class28.method419();
					}
				} else {
					class188.method3622(this, field4327, field2832);
				}

				if (field499 == 30) {
					this.method1244();
				} else if (40 == field499 || field499 == 45) {
					this.method1243();
				}

				return;
			}

			var2.field4193.method6398(var2.field4192, (int)var2.field4745, var2.field4191, false);
		}
	}

	protected final void method545(boolean var1) {
		boolean var3;
		label141: {
			try {
				if (class298.field3389 == 2) {
					if (field2382 == null) {
						field2382 = class303.method5747(field3388, field4411, field1913);
						if (field2382 == null) {
							var3 = false;
							break label141;
						}
					}

					if (null == field3390) {
						field3390 = new class46(field3387, field3386);
					}

					if (field4942.method5570(field2382, field3385, field3390, 22050)) {
						field4942.method5649();
						field4942.method5568(field1324);
						field4942.method5573(field2382, field1459);
						class298.field3389 = 0;
						field2382 = null;
						field3390 = null;
						field3388 = null;
						var3 = true;
						break label141;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				field4942.method5574();
				class298.field3389 = 0;
				field2382 = null;
				field3390 = null;
				field3388 = null;
			}

			var3 = false;
		}

		if (var3 && field739 && null != field163) {
			field163.method847();
		}

		if ((field499 == 10 || field499 == 20 || 30 == field499) && field714 != 0L && class294.method2575() > field714) {
			class56.method1134(method6581());
		}

		int var5;
		if (var1) {
			for (var5 = 0; var5 < 100; ++var5) {
				field706[var5] = true;
			}
		}

		if (field499 == 0) {
			this.method547(class72.field897, class72.field902, var1);
		} else if (5 == field499) {
			class7.method42(field1635, field4327, field2832);
		} else if (field499 != 10 && field499 != 11) {
			if (field499 == 20) {
				class7.method42(field1635, field4327, field2832);
			} else if (field499 == 50) {
				class7.method42(field1635, field4327, field2832);
			} else if (25 == field499) {
				if (1 == field622) {
					if (field560 > field726) {
						field726 = field560;
					}

					var5 = (field726 * 50 - field560 * 50) / field726;
					class260.method5271(class337.field3961 + class97.field1290 + class97.field1287 + var5 + "%" + class97.field1288, false);
				} else if (field622 == 2) {
					if (field558 > field559) {
						field559 = field558;
					}

					var5 = (field559 * 50 - field558 * 50) / field559 + 50;
					class260.method5271(class337.field3961 + class97.field1290 + class97.field1287 + var5 + "%" + class97.field1288, false);
				} else {
					class260.method5271(class337.field3961, false);
				}
			} else if (field499 == 30) {
				this.method1246();
			} else if (40 == field499) {
				class260.method5271(class337.field4141 + class97.field1290 + class337.field3885, false);
			} else if (45 == field499) {
				class260.method5271(class337.field4008, false);
			}
		} else {
			class7.method42(field1635, field4327, field2832);
		}

		if (field499 == 30 && 0 == field713 && !var1 && !field715) {
			for (var5 = 0; var5 < field781; ++var5) {
				if (field707[var5]) {
					class35.field2381.method9052(field709[var5], field710[var5], field640[var5], field712[var5]);
					field707[var5] = false;
				}
			}
		} else if (field499 > 0) {
			class35.field2381.method9051(0, 0);

			for (var5 = 0; var5 < field781; ++var5) {
				field707[var5] = false;
			}
		}

	}

	protected final void method542() {
		if (field4387.method2695()) {
			field4387.method2668();
		}

		if (null != field1449) {
			field1449.field1062 = false;
		}

		field1449 = null;
		field753.method2737();
		class36.method1969();
		field1489 = null;
		if (field163 != null) {
			field163.method817((byte)-1);
		}

		if (field1997 != null) {
			field1997.method817((byte)-1);
		}

		class345.method5549();
		class341.method3175();
		if (field78 != null) {
			field78.method2761();
			field78 = null;
		}

		try {
			class170.field1836.method8436();

			for (int var2 = 0; var2 < field1833; ++var2) {
				field4375[var2].method8436();
			}

			class170.field1841.method8436();
			class170.field1835.method8436();
		} catch (Exception var3) {
		}

		this.field662.method182();
	}

	void method1240() {
		if (1000 != field499) {
			boolean var2 = class218.method4258();
			if (!var2) {
				this.method1241();
			}

		}
	}

	void method1241() {
		if (class345.field4262 >= 4) {
			this.method549("js5crc");
			class139.method3145(1000);
		} else {
			if (class345.field4261 >= 4) {
				if (field499 <= 5) {
					this.method549("js5io");
					class139.method3145(1000);
					return;
				}

				field521 = 3000;
				class345.field4261 = 3;
			}

			if (--field521 + 1 <= 0) {
				try {
					if (field520 == 0) {
						field2974 = class35.field201.method3421(field1420, field1024);
						++field520;
					}

					if (field520 == 1) {
						if (field2974.field1884 == 2) {
							this.method1242(-1);
							return;
						}

						if (field2974.field1884 == 1) {
							++field520;
						}
					}

					if (2 == field520) {
						field1957 = class414.method3601((Socket)field2974.field1888, 40000, 5000);
						class489 var2 = new class489(5);
						var2.method8695(15);
						var2.method8644(213);
						field1957.method7710(var2.field4991, 0, 5);
						++field520;
						field1581 = class294.method2575();
					}

					if (field520 == 3) {
						if (field1957.method7707() > 0) {
							int var10 = field1957.method7715();
							if (var10 != 0) {
								this.method1242(var10);
								return;
							}

							++field520;
						} else if (class294.method2575() - field1581 > 30000L) {
							this.method1242(-2);
							return;
						}
					}

					if (field520 == 4) {
						class414 var11 = field1957;
						boolean var3 = field499 > 20;
						if (class345.field4241 != null) {
							try {
								class345.field4241.method7711();
							} catch (Exception var8) {
							}

							class345.field4241 = null;
						}

						class345.field4241 = var11;
						class178.method3487(var3);
						class345.field4252.field4989 = 0;
						class345.field973 = null;
						class345.field4253 = null;
						class345.field4254 = 0;

						while (true) {
							class343 var4 = (class343)class345.field4244.method8387();
							if (var4 == null) {
								while (true) {
									var4 = (class343)class345.field4249.method8387();
									if (var4 == null) {
										if (class345.field4256 != 0) {
											try {
												class489 var12 = new class489(4);
												var12.method8695(4);
												var12.method8695(class345.field4256);
												var12.method8642(0);
												class345.field4241.method7710(var12.field4991, 0, 4);
											} catch (IOException var7) {
												try {
													class345.field4241.method7711();
												} catch (Exception var6) {
												}

												++class345.field4261;
												class345.field4241 = null;
											}
										}

										class345.field4251 = 0;
										class345.field4260 = class294.method2575();
										field2974 = null;
										field1957 = null;
										field520 = 0;
										field522 = 0;
										return;
									}

									class345.field4246.method6707(var4);
									class345.field4247.method8382(var4, var4.field4745);
									++class345.field4257;
									--class345.field4250;
								}
							}

							class345.field4242.method8382(var4, var4.field4745);
							++class345.field4243;
							--class345.field4245;
						}
					}
				} catch (IOException var9) {
					this.method1242(-3);
				}

			}
		}
	}

	void method1242(int var1) {
		field2974 = null;
		field1957 = null;
		field520 = 0;
		if (field4569 == field1024) {
			field1024 = field1566;
		} else {
			field1024 = field4569;
		}

		++field522;
		if (field522 < 2 || var1 != 7 && var1 != 9) {
			if (field522 >= 2 && var1 == 6) {
				this.method549("js5connect_outofdate");
				class139.method3145(1000);
			} else if (field522 >= 4) {
				if (field499 <= 5) {
					this.method549("js5connect");
					class139.method3145(1000);
				} else {
					field521 = 3000;
				}
			}
		} else if (field499 <= 5) {
			this.method549("js5connect_full");
			class139.method3145(1000);
		} else {
			field521 = 3000;
		}

	}

	final void method1243() {
		class414 var2 = field753.method2740();
		class488 var3 = field753.field1386;

		try {
			if (0 == field765) {
				if (field1870 == null && (field541.method2064() || field524 > 250)) {
					field1870 = field541.method2065();
					field541.method2063();
					field541 = null;
				}

				if (field1870 != null) {
					if (var2 != null) {
						var2.method7711();
						var2 = null;
					}

					field5 = null;
					field553 = false;
					field524 = 0;
					if (field528.method8947()) {
						if (this.method1410()) {
							try {
								this.method1237(field1319);
								method5491(21);
							} catch (Throwable var20) {
								class388.method7339((String)null, var20);
								class316.method6116(65);
								return;
							}
						} else {
							if (!this.method1235()) {
								class316.method6116(65);
								return;
							}

							try {
								this.method1239(field3476, field1472);
								method5491(20);
							} catch (Exception var19) {
								class388.method7339((String)null, var19);
								class316.method6116(65);
								return;
							}
						}
					} else {
						method5491(1);
					}
				}
			}

			class21 var22;
			if (field765 == 21) {
				if (this.field537 != null) {
					if (!this.field537.isDone()) {
						return;
					}

					if (this.field537.isCancelled()) {
						class316.method6116(65);
						this.field537 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field537.get();
						if (!var4.isSuccess()) {
							class316.method6116(65);
							this.field537 = null;
							return;
						}

						field4348 = var4.getAccessToken();
						field1319 = var4.getRefreshToken();
						this.field537 = null;
					} catch (Exception var18) {
						class388.method7339((String)null, var18);
						class316.method6116(65);
						this.field537 = null;
						return;
					}
				} else {
					if (this.field543 == null) {
						class316.method6116(65);
						return;
					}

					if (!this.field543.method270()) {
						return;
					}

					if (this.field543.method267()) {
						class388.method7339(this.field543.method269(), (Throwable)null);
						class316.method6116(65);
						this.field543 = null;
						return;
					}

					var22 = this.field543.method271();
					if (var22.method297() != 200) {
						class316.method6116(65);
						this.field543 = null;
						return;
					}

					field524 = 0;
					class438 var5 = new class438(var22.method299());

					try {
						field4348 = var5.method8008().getString("access_token");
						field1319 = var5.method8008().getString("refresh_token");
					} catch (Exception var17) {
						class388.method7339("Error parsing tokens", var17);
						class316.method6116(65);
						this.field543 = null;
						return;
					}
				}

				this.method1605(field4348);
				method5491(20);
			}

			if (20 == field765) {
				if (null != this.field533) {
					if (!this.field533.isDone()) {
						return;
					}

					if (this.field533.isCancelled()) {
						class316.method6116(65);
						this.field533 = null;
						return;
					}

					try {
						OtlTokenResponse var23 = (OtlTokenResponse)this.field533.get();
						if (!var23.isSuccess()) {
							class316.method6116(65);
							this.field533 = null;
							return;
						}

						this.field529 = var23.getToken();
						this.field533 = null;
					} catch (Exception var16) {
						class388.method7339((String)null, var16);
						class316.method6116(65);
						this.field533 = null;
						return;
					}
				} else {
					if (null == this.field523) {
						class316.method6116(65);
						return;
					}

					if (!this.field523.method270()) {
						return;
					}

					if (this.field523.method267()) {
						class388.method7339(this.field523.method269(), (Throwable)null);
						class316.method6116(65);
						this.field523 = null;
						return;
					}

					var22 = this.field523.method271();
					if (var22.method297() != 200) {
						class388.method7339("Response code: " + var22.method297() + "Response body: " + var22.method299(), (Throwable)null);
						class316.method6116(65);
						this.field523 = null;
						return;
					}

					List var25 = (List)var22.method298().get("Content-Type");
					if (null != var25 && var25.contains(class436.field4704.method7996())) {
						try {
							JSONObject var6 = new JSONObject(var22.method299());
							this.field529 = var6.getString("token");
						} catch (JSONException var15) {
							class388.method7339((String)null, var15);
							class316.method6116(65);
							this.field523 = null;
							return;
						}
					} else {
						this.field529 = var22.method299();
					}

					this.field523 = null;
				}

				field524 = 0;
				method5491(1);
			}

			if (field765 == 1) {
				if (null == field5) {
					field5 = class35.field201.method3421(field1420, field1024);
				}

				if (field5.field1884 == 2) {
					throw new IOException();
				}

				if (field5.field1884 == 1) {
					var2 = class414.method3601((Socket)field5.field1888, 40000, 5000);
					field753.method2736(var2);
					field5 = null;
					method5491(2);
				}
			}

			class289 var24;
			if (field765 == 2) {
				field753.method2742();
				var24 = class289.method8504();
				var24.field3212.method8695(class291.field3345.field3347);
				field753.method2735(var24);
				field753.method2751();
				var3.field4989 = 0;
				method5491(3);
			}

			int var27;
			if (3 == field765) {
				if (null != field163) {
					field163.method815();
				}

				if (null != field1997) {
					field1997.method815();
				}

				if (var2.method7729(1)) {
					var27 = var2.method7715();
					if (null != field163) {
						field163.method815();
					}

					if (null != field1997) {
						field1997.method815();
					}

					if (var27 != 0) {
						class316.method6116(var27);
						return;
					}

					var3.field4989 = 0;
					method5491(4);
				}
			}

			if (field765 == 4) {
				if (var3.field4989 < 8) {
					var27 = var2.method7707();
					if (var27 > 8 - var3.field4989) {
						var27 = 8 - var3.field4989;
					}

					if (var27 > 0) {
						var2.method7713(var3.field4991, var3.field4989, var27);
						var3.field4989 += var27;
					}
				}

				if (8 == var3.field4989) {
					var3.field4989 = 0;
					field4288 = var3.method8681();
					method5491(5);
				}
			}

			int var7;
			if (5 == field765) {
				field753.field1386.field4989 = 0;
				field753.method2742();
				class488 var33 = new class488(500);
				int[] var26 = new int[]{field1870.nextInt(), field1870.nextInt(), field1870.nextInt(), field1870.nextInt()};
				var33.field4989 = 0;
				var33.method8695(1);
				var33.method8644(var26[0]);
				var33.method8644(var26[1]);
				var33.method8644(var26[2]);
				var33.method8644(var26[3]);
				var33.method8640(field4288);
				if (field499 == 40) {
					var33.method8644(field3723[0]);
					var33.method8644(field3723[1]);
					var33.method8644(field3723[2]);
					var33.method8644(field3723[3]);
				} else {
					if (50 == field499) {
						var33.method8695(class136.field1620.method6674());
						var33.method8644(field4479);
					} else {
						var33.method8695(field527.method6674());
						switch(field527.field1621) {
						case 0:
							var33.field4989 += 4;
							break;
						case 1:
						case 3:
							var33.method8702(field2331);
							++var33.field4989;
							break;
						case 2:
							var33.method8644(field112.method2418(class72.field930));
						}
					}

					if (field528.method8947()) {
						var33.method8695(class494.field5045.method6674());
						var33.method8648(this.field529);
					} else {
						var33.method8695(class494.field5049.method6674());
						var33.method8648(class72.field909);
					}
				}

				var33.method8685(class71.field886, class71.field888);
				field3723 = var26;
				class289 var29 = class289.method8504();
				var29.field3212.field4989 = 0;
				if (40 == field499) {
					var29.field3212.method8695(class291.field3342.field3347);
				} else {
					var29.field3212.method8695(class291.field3343.field3347);
				}

				var29.field3212.method8642(0);
				var7 = var29.field3212.field4989;
				var29.field3212.method8644(213);
				var29.field3212.method8644(1);
				var29.field3212.method8695(field495);
				var29.field3212.method8695(field496);
				byte var8 = 0;
				var29.field3212.method8695(var8);
				var29.field3212.method8886(var33.field4991, 0, var33.field4989);
				int var9 = var29.field3212.field4989;
				var29.field3212.method8648(class72.field930);
				var29.field3212.method8695((field715 ? 1 : 0) << 1 | (field493 ? 1 : 0));
				var29.field3212.method8642(class35.field211);
				var29.field3212.method8642(class35.field3026);
				class384.method7283(var29.field3212);
				var29.field3212.method8648(field1404);
				var29.field3212.method8644(field4601);
				class489 var10 = new class489(field1437.method8065());
				field1437.method8070(var10);
				var29.field3212.method8886(var10.field4991, 0, var10.field4991.length);
				var29.field3212.method8695(field495);
				var29.field3212.method8644(0);
				var29.field3212.method8711(field118.field4226);
				var29.field3212.method8711(field4300.field4226);
				var29.field3212.method8645(field4271.field4226);
				var29.field3212.method8709(field4788.field4226);
				var29.field3212.method8645(field1532.field4226);
				var29.field3212.method8709(field4217.field4226);
				var29.field3212.method8644(field4548.field4226);
				var29.field3212.method8709(field1064.field4226);
				var29.field3212.method8709(field1069.field4226);
				var29.field3212.method8645(field159.field4226);
				var29.field3212.method8709(field2684.field4226);
				var29.field3212.method8711(field1568.field4226);
				var29.field3212.method8711(field2869.field4226);
				var29.field3212.method8709(field2098.field4226);
				var29.field3212.method8645(field1828.field4226);
				var29.field3212.method8709(field2102.field4226);
				var29.field3212.method8709(field3804.field4226);
				var29.field3212.method8711(field2336.field4226);
				var29.field3212.method8711(0);
				var29.field3212.method8645(field4688.field4226);
				var29.field3212.method8711(class75.field1541.field4226);
				var29.field3212.method8731(var26, var9, var29.field3212.field4989);
				var29.field3212.method8654(var29.field3212.field4989 - var7);
				field753.method2735(var29);
				field753.method2751();
				field753.field1385 = new class506(var26);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = 50 + var26[var12];
				}

				var3.method8606(var11);
				method5491(6);
			}

			int var28;
			if (6 == field765 && var2.method7707() > 0) {
				var27 = var2.method7715();
				if (var27 == 61) {
					var28 = var2.method7707();
					class72.field2984 = var28 == 1 && var2.method7715() == 1;
					method5491(5);
				}

				if (var27 == 21 && 20 == field499) {
					method5491(12);
				} else if (var27 == 2) {
					method5491(14);
				} else if (var27 == 15 && field499 == 40) {
					field753.field1388 = -1;
					method5491(19);
				} else if (var27 == 64) {
					method5491(10);
				} else if (var27 == 23 && field525 < 1) {
					++field525;
					method5491(0);
				} else if (var27 == 29) {
					method5491(17);
				} else {
					if (var27 != 69) {
						class316.method6116(var27);
						return;
					}

					method5491(7);
				}
			}

			if (field765 == 7 && var2.method7707() >= 2) {
				var2.method7713(var3.field4991, 0, 2);
				var3.field4989 = 0;
				field72 = var3.method8660();
				method5491(8);
			}

			if (field765 == 8 && var2.method7707() >= field72) {
				var3.field4989 = 0;
				var2.method7713(var3.field4991, var3.field4989, field72);
				class7[] var36 = new class7[]{class7.field18};
				class7 var30 = var36[var3.method8658()];

				try {
					class4 var31 = class5.method2820(var30);
					this.field554 = new class8(var3, var31);
					method5491(9);
				} catch (Exception var14) {
					class316.method6116(22);
					return;
				}
			}

			if (field765 == 9 && this.field554.method59()) {
				this.field542 = this.field554.method51();
				this.field554.method50();
				this.field554 = null;
				if (null == this.field542) {
					class316.method6116(22);
					return;
				}

				field753.method2742();
				var24 = class289.method8504();
				var24.field3212.method8695(class291.field3339.field3347);
				var24.field3212.method8642(this.field542.field4989);
				var24.field3212.method8652(this.field542);
				field753.method2735(var24);
				field753.method2751();
				this.field542 = null;
				method5491(6);
			}

			if (10 == field765 && var2.method7707() > 0) {
				field119 = var2.method7715();
				method5491(11);
			}

			if (field765 == 11 && var2.method7707() >= field119) {
				var2.method7713(var3.field4991, 0, field119);
				var3.field4989 = 0;
				method5491(6);
			}

			if (12 == field765 && var2.method7707() > 0) {
				field526 = (var2.method7715() + 3) * 60;
				method5491(13);
			}

			if (field765 == 13) {
				field524 = 0;
				class72.method4061(class337.field4025, class337.field4058, field526 / 60 + class337.field3881);
				if (--field526 <= 0) {
					method5491(0);
				}

			} else {
				if (field765 == 14 && var2.method7707() >= 1) {
					field28 = var2.method7715();
					method5491(15);
				}

				if (15 == field765 && var2.method7707() >= field28) {
					boolean var38 = var2.method7715() == 1;
					var2.method7713(var3.field4991, 0, 4);
					var3.field4989 = 0;
					boolean var32 = false;
					if (var38) {
						var28 = var3.method8602() << 24;
						var28 |= var3.method8602() << 16;
						var28 |= var3.method8602() << 8;
						var28 |= var3.method8602();
						field112.method2432(class72.field930, var28);
					}

					if (field540) {
						field112.method2410(class72.field930);
					} else {
						field112.method2410((String)null);
					}

					class94.method2624();
					field682 = var2.method7715();
					field666 = var2.method7715() == 1;
					field664 = var2.method7715();
					field664 <<= 8;
					field664 += var2.method7715();
					field613 = var2.method7715();
					var2.method7713(var3.field4991, 0, 8);
					var3.field4989 = 0;
					this.field544 = var3.method8681();
					if (field28 >= 29) {
						var2.method7713(var3.field4991, 0, 8);
						var3.field4989 = 0;
						field614 = var3.method8681();
					}

					var2.method7713(var3.field4991, 0, 1);
					var3.field4989 = 0;
					class290[] var34 = class290.method5504();
					var7 = var3.method8604();
					if (var7 < 0 || var7 >= var34.length) {
						throw new IOException(var7 + " " + var3.field4989);
					}

					field753.field1382 = var34[var7];
					field753.field1388 = field753.field1382.field3338;
					var2.method7713(var3.field4991, 0, 2);
					var3.field4989 = 0;
					field753.field1388 = var3.method8660();

					try {
						class27.method394(field466, "zap");
					} catch (Throwable var13) {
					}

					method5491(16);
				}

				if (field765 != 16) {
					if (field765 == 17 && var2.method7707() >= 2) {
						var3.field4989 = 0;
						var2.method7713(var3.field4991, 0, 2);
						var3.field4989 = 0;
						field13 = var3.method8660();
						method5491(18);
					}

					if (field765 == 18 && var2.method7707() >= field13) {
						var3.field4989 = 0;
						var2.method7713(var3.field4991, 0, field13);
						var3.field4989 = 0;
						String var42 = var3.method8669();
						String var40 = var3.method8669();
						String var37 = var3.method8669();
						class72.method4061(var42, var40, var37);
						class139.method3145(10);
						if (field528.method8947()) {
							class72.method3061(9);
						}
					}

					if (19 == field765) {
						if (field753.field1388 == -1) {
							if (var2.method7707() < 2) {
								return;
							}

							var2.method7713(var3.field4991, 0, 2);
							var3.field4989 = 0;
							field753.field1388 = var3.method8660();
						}

						if (var2.method7707() >= field753.field1388) {
							var2.method7713(var3.field4991, 0, field753.field1388);
							var3.field4989 = 0;
							var27 = field753.field1388;
							field516.method7345();
							class122.method2930();
							class103.method7828(var3);
							if (var3.field4989 != var27) {
								throw new RuntimeException();
							}
						}
					} else {
						++field524;
						if (field524 > 2000) {
							if (field525 < 1) {
								if (field4569 == field1024) {
									field1024 = field1566;
								} else {
									field1024 = field4569;
								}

								++field525;
								method5491(0);
							} else {
								class316.method6116(-3);
							}
						}
					}
				} else {
					if (var2.method7707() >= field753.field1388) {
						var3.field4989 = 0;
						var2.method7713(var3.field4991, 0, field753.field1388);
						field516.method7343();
						field502 = -1L;
						field1449.field1056 = 0;
						field3732 = true;
						field506 = true;
						field727 = -1L;
						class37.field255 = new class365();
						field753.method2742();
						field753.field1386.field4989 = 0;
						field753.field1382 = null;
						field753.field1392 = null;
						field753.field1393 = null;
						field753.field1387 = null;
						field753.field1388 = 0;
						field753.field1390 = 0;
						field545 = 0;
						field761 = 0;
						field508 = 0;
						field633 = 0;
						field669 = false;
						class36.field239 = 0;
						class106.method3331();
						field649 = 0;
						field651 = false;
						field507 = 0;
						field758 = 0;
						field505 = 0;
						class459.field1586 = null;
						field653 = 0;
						field730 = -1;
						field735 = 0;
						field487 = 0;
						field501 = class99.field1309;
						field517 = class99.field1309;
						field737 = 0;
						class103.field1335 = 0;

						for (var27 = 0; var27 < 2048; ++var27) {
							class103.field1334[var27] = null;
							class103.field1333[var27] = class211.field2390;
						}

						for (var27 = 0; var27 < 2048; ++var27) {
							field611[var27] = null;
						}

						for (var27 = 0; var27 < 65536; ++var27) {
							field546[var27] = null;
						}

						field623 = -1;
						field551.method6710();
						field627.method6710();

						for (var27 = 0; var27 < 4; ++var27) {
							for (var28 = 0; var28 < 104; ++var28) {
								for (int var35 = 0; var35 < 104; ++var35) {
									field624[var27][var28][var35] = null;
								}
							}
						}

						field574 = new class363();
						class67.field804.method1799();

						for (var27 = 0; var27 < field1909; ++var27) {
							class182 var39 = class182.method7787(var27);
							if (var39 != null) {
								class307.field3481[var27] = 0;
								class307.field3482[var27] = 0;
							}
						}

						field4387.method2666();
						field665 = -1;
						if (field656 != -1) {
							var27 = field656;
							if (var27 != -1 && field3037[var27]) {
								class317.field1430.method6461(var27);
								if (field2057[var27] != null) {
									for (var28 = 0; var28 < field2057[var27].length; ++var28) {
										if (field2057[var27][var28] != null) {
											field2057[var27][var28] = null;
										}
									}

									field2057[var27] = null;
									field3037[var27] = false;
								}
							}
						}

						for (class83 var41 = (class83)field657.method8387(); null != var41; var41 = (class83)field657.method8384()) {
							class358.method6676(var41, true);
						}

						field656 = -1;
						field657 = new class465(8);
						field661 = null;
						field633 = 0;
						field669 = false;
						field772.method5798((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

						for (var27 = 0; var27 < 8; ++var27) {
							field736[var27] = null;
							field588[var27] = false;
						}

						class81.field1022 = new class465(32);
						field500 = true;

						for (var27 = 0; var27 < 100; ++var27) {
							field706[var27] = true;
						}

						method12();
						class67.field1426 = null;
						field2269 = null;
						Arrays.fill(field750, (Object)null);
						field253 = null;
						Arrays.fill(field679, (Object)null);

						for (var27 = 0; var27 < 8; ++var27) {
							field776[var27] = new class353();
						}

						class19.field4389 = null;
						class103.method7828(var3);
						field165 = -1;
						class128.method3047(false, var3);
						field753.field1382 = null;
					}

				}
			}
		} catch (IOException var21) {
			if (field525 < 1) {
				if (field4569 == field1024) {
					field1024 = field1566;
				} else {
					field1024 = field4569;
				}

				++field525;
				method5491(0);
			} else {
				class316.method6116(-2);
			}
		}
	}

	final void method1244() {
		if (field545 > 1) {
			--field545;
		}

		if (field761 > 0) {
			--field761;
		}

		if (field553) {
			field553 = false;
			method6595();
		} else {
			if (!field669) {
				method3297();
			}

			int var2;
			for (var2 = 0; var2 < 100 && this.method1333(field753); ++var2) {
			}

			if (30 == field499) {
				while (true) {
					class38 var3 = (class38)class37.field255.method6798();
					boolean var16;
					if (null == var3) {
						var16 = false;
					} else {
						var16 = true;
					}

					int var4;
					class289 var17;
					if (!var16) {
						class289 var18;
						int var19;
						if (field516.field4484) {
							var18 = class331.method6337(class287.field3187, field753.field1385);
							var18.field3212.method8695(0);
							var19 = var18.field3212.field4989;
							field516.method7346(var18.field3212);
							var18.field3212.method8655(var18.field3212.field4989 - var19);
							field753.method2735(var18);
							field516.method7344();
						}

						Object var20;
						synchronized(var20 = field1449.field1055){}
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						int var13;
						if (field604) {
							if (0 != class36.field252 || field1449.field1056 >= 40) {
								var17 = null;
								var4 = 0;
								var5 = 0;
								var6 = 0;
								var7 = 0;

								for (var8 = 0; var8 < field1449.field1056 && (var17 == null || var17.field3212.field4989 - var4 < 246); ++var8) {
									var5 = var8;
									var9 = field1449.field1054[var8];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									var10 = field1449.field1057[var8];
									if (var10 < -1) {
										var10 = -1;
									} else if (var10 > 65534) {
										var10 = 65534;
									}

									if (field503 != var10 || field504 != var9) {
										if (var17 == null) {
											var17 = class331.method6337(class287.field3194, field753.field1385);
											var17.field3212.method8695(0);
											var4 = var17.field3212.field4989;
											class488 var10000 = var17.field3212;
											var10000.field4989 += 2;
											var6 = 0;
											var7 = 0;
										}

										if (-1L != field605) {
											var11 = var10 - field503;
											var12 = var9 - field504;
											var13 = (int)((field1449.field1059[var8] - field605) / 20L);
											var6 = (int)((long)var6 + (field1449.field1059[var8] - field605) % 20L);
										} else {
											var11 = var10;
											var12 = var9;
											var13 = Integer.MAX_VALUE;
										}

										field503 = var10;
										field504 = var9;
										if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
											var11 += 32;
											var12 += 32;
											var17.field3212.method8642((var13 << 12) + (var11 << 6) + var12);
										} else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
											var11 += 128;
											var12 += 128;
											var17.field3212.method8695(var13 + 128);
											var17.field3212.method8642((var11 << 8) + var12);
										} else if (var13 < 32) {
											var17.field3212.method8695(var13 + 192);
											if (var10 != -1 && var9 != -1) {
												var17.field3212.method8644(var10 | var9 << 16);
											} else {
												var17.field3212.method8644(Integer.MIN_VALUE);
											}
										} else {
											var17.field3212.method8642((var13 & 8191) + 57344);
											if (var10 != -1 && var9 != -1) {
												var17.field3212.method8644(var10 | var9 << 16);
											} else {
												var17.field3212.method8644(Integer.MIN_VALUE);
											}
										}

										++var7;
										field605 = field1449.field1059[var8];
									}
								}

								if (null != var17) {
									var17.field3212.method8655(var17.field3212.field4989 - var4);
									var8 = var17.field3212.field4989;
									var17.field3212.field4989 = var4;
									var17.field3212.method8695(var6 / var7);
									var17.field3212.method8695(var6 % var7);
									var17.field3212.field4989 = var8;
									field753.method2735(var17);
								}

								if (var5 >= field1449.field1056) {
									field1449.field1056 = 0;
								} else {
									class85 var46 = field1449;
									var46.field1056 -= var5;
									System.arraycopy(field1449.field1057, var5, field1449.field1057, 0, field1449.field1056);
									System.arraycopy(field1449.field1054, var5, field1449.field1054, 0, field1449.field1056);
									System.arraycopy(field1449.field1059, var5, field1449.field1059, 0, field1449.field1056);
								}
							}
						} else {
							field1449.field1056 = 0;
						}

						class289 var29;
						if (1 == class36.field252 || !field4941 && 4 == class36.field252 || class36.field252 == 2) {
							long var21 = class36.field249 - field502;
							if (var21 > 32767L) {
								var21 = 32767L;
							}

							field502 = class36.field249;
							var4 = class36.field251;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class35.field3026) {
								var4 = class35.field3026;
							}

							var5 = class36.field250;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > class35.field211) {
								var5 = class35.field211;
							}

							var6 = (int)var21;
							var29 = class331.method6337(class287.field3112, field753.field1385);
							var29.field3212.method8642((2 == class36.field252 ? 1 : 0) + (var6 << 1));
							var29.field3212.method8642(var5);
							var29.field3212.method8642(var4);
							field753.method2735(var29);
						}

						if (field722.field2364 > 0) {
							var18 = class331.method6337(class287.field3104, field753.field1385);
							var18.field3212.method8642(0);
							var19 = var18.field3212.field4989;
							long var22 = class294.method2575();

							for (var6 = 0; var6 < field722.field2364; ++var6) {
								long var31 = var22 - field727;
								if (var31 > 16777215L) {
									var31 = 16777215L;
								}

								field727 = var22;
								var18.field3212.method8705((int)var31);
								var18.field3212.method8695(field722.field2350[var6]);
							}

							var18.field3212.method8654(var18.field3212.field4989 - var19);
							field753.method2735(var18);
						}

						if (field619 > 0) {
							--field619;
						}

						if (field722.method4076(96) || field722.method4076(97) || field722.method4076(98) || field722.method4076(99)) {
							field757 = true;
						}

						if (field757 && field619 <= 0) {
							field619 = 20;
							field757 = false;
							var18 = class331.method6337(class287.field3176, field753.field1385);
							var18.field3212.method8642(field758);
							var18.field3212.method8642(field595);
							field753.method2735(var18);
						}

						if (field3732 && !field506) {
							field506 = true;
							var18 = class331.method6337(class287.field3155, field753.field1385);
							var18.field3212.method8695(1);
							field753.method2735(var18);
						}

						if (!field3732 && field506) {
							field506 = false;
							var18 = class331.method6337(class287.field3155, field753.field1385);
							var18.field3212.method8695(0);
							field753.method2735(var18);
						}

						if (null != field1542) {
							field1542.method8140();
						}

						method5782();
						method3532();
						class112.method2833();
						if (30 != field499) {
							return;
						}

						for (class90 var23 = (class90)field574.method6716(); null != var23; var23 = (class90)field574.method6725()) {
							if (var23.field1132 > 0) {
								--var23.field1132;
							}

							if (0 == var23.field1132) {
								if (var23.field1123 < 0 || class78.method3744(var23.field1123, var23.field1124)) {
									class82.method2192(var23.field1131, var23.field1120, var23.field1121, var23.field1122, var23.field1123, var23.field1129, var23.field1124, var23.field1136);
									var23.method8051();
								}
							} else {
								if (var23.field1126 > 0) {
									--var23.field1126;
								}

								if (var23.field1126 == 0 && var23.field1121 >= 1 && var23.field1122 >= 1 && var23.field1121 <= 102 && var23.field1122 <= 102 && (var23.field1128 < 0 || class78.method3744(var23.field1128, var23.field1125))) {
									class82.method2192(var23.field1131, var23.field1120, var23.field1121, var23.field1122, var23.field1128, var23.field1127, var23.field1125, var23.field1136);
									var23.field1126 = -1;
									if (var23.field1123 == var23.field1128 && -1 == var23.field1123) {
										var23.method8051();
									} else if (var23.field1123 == var23.field1128 && var23.field1129 == var23.field1127 && var23.field1125 == var23.field1124) {
										var23.method8051();
									}
								}
							}
						}

						int var10002;
						for (var2 = 0; var2 < field507; ++var2) {
							var10002 = field556[var2]--;
							if (field556[var2] >= -10) {
								class40 var24 = field745[var2];
								if (null == var24) {
									class40 var47 = (class40)null;
									var24 = class40.method774(field4688, field741[var2], 0);
									if (var24 == null) {
										continue;
									}

									int[] var48 = field556;
									var48[var2] += var24.method776();
									field745[var2] = var24;
								}

								if (field556[var2] < 0) {
									if (field744[var2] != 0) {
										var5 = (field744[var2] & 255) * 128;
										var6 = field744[var2] >> 16 & 255;
										var7 = var6 * 128 + 64 - field3454.field1171;
										if (var7 < 0) {
											var7 = -var7;
										}

										var8 = field744[var2] >> 8 & 255;
										var9 = 64 + var8 * 128 - field3454.field1138;
										if (var9 < 0) {
											var9 = -var9;
										}

										var10 = var7 + var9 - 128;
										if (var10 > var5) {
											field556[var2] = -100;
											continue;
										}

										if (var10 < 0) {
											var10 = 0;
										}

										var4 = (var5 - var10) * field112.method2409() / var5;
									} else {
										var4 = field112.method2407();
									}

									if (var4 > 0) {
										class41 var25 = var24.method775().method788(field2981);
										class48 var33 = class48.method903(var25, 100, var4);
										var33.method906(field603[var2] - 1);
										field1574.method747(var33);
									}

									field556[var2] = -100;
								}
							} else {
								--field507;

								for (var19 = var2; var19 < field507; ++var19) {
									field741[var19] = field741[var19 + 1];
									field745[var19] = field745[var19 + 1];
									field603[var19] = field603[var19 + 1];
									field556[var19] = field556[var19 + 1];
									field744[var19] = field744[var19 + 1];
								}

								--var2;
							}
						}

						if (field739 && !class5.method19()) {
							if (field112.method2405() != 0 && -1 != field650) {
								class298.method1202(field4548, field650, 0, field112.method2405(), false);
							}

							field739 = false;
						}

						++field753.field1390;
						if (field753.field1390 > 750) {
							method6595();
							return;
						}

						method4090();
						method3614();
						int[] var32 = class103.field1341;

						for (var19 = 0; var19 < class103.field1335; ++var19) {
							class88 var26 = field611[var32[var19]];
							if (null != var26 && var26.field1161 > 0) {
								--var26.field1161;
								if (var26.field1161 == 0) {
									var26.field1149 = null;
								}
							}
						}

						for (var19 = 0; var19 < field737; ++var19) {
							var4 = field548[var19];
							class96 var27 = field546[var4];
							if (var27 != null && var27.field1161 > 0) {
								--var27.field1161;
								if (var27.field1161 == 0) {
									var27.field1149 = null;
								}
							}
						}

						++field565;
						if (field607 != 0) {
							field606 += 20;
							if (field606 >= 400) {
								field607 = 0;
							}
						}

						class317 var35 = field3394;
						class317 var37 = field1575;
						field3394 = null;
						field1575 = null;
						field672 = null;
						field756 = false;
						field673 = false;
						field488 = 0;

						while (field722.method4071() && field488 < 128) {
							if (field682 >= 2 && field722.method4076(82) && 66 == field722.field2363) {
								StringBuilder var28 = new StringBuilder();

								class61 var41;
								for (Iterator var36 = class106.field1375.iterator(); var36.hasNext(); var28.append(var41.field479).append('\n')) {
									var41 = (class61)var36.next();
									if (null != var41.field473 && !var41.field473.isEmpty()) {
										var28.append(var41.field473).append(':');
									}
								}

								String var30 = var28.toString();
								field466.method556(var30);
							} else if (field505 != 1 || field722.field2362 <= 0) {
								field557[field488] = field722.field2363;
								field725[field488] = field722.field2362;
								++field488;
							}
						}

						boolean var34 = field682 >= 2;
						class289 var38;
						if (var34 && field722.method4076(82) && field722.method4076(81) && field697 != 0) {
							var5 = field3454.field1106 - field697;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > 3) {
								var5 = 3;
							}

							if (field3454.field1106 != var5) {
								var6 = field2850 + field3454.field1174[0];
								var7 = field2841 + field3454.field1176[0];
								var38 = class331.method6337(class287.field3180, field753.field1385);
								var38.field3212.method8645(0);
								var38.field3212.method8698(var6);
								var38.field3212.method8688(var5);
								var38.field3212.method8859(var7);
								field753.method2735(var38);
							}

							field697 = 0;
						}

						if (1 == class36.field252) {
							field723.method4051();
						}

						if (field656 != -1) {
							method726(field656, 0, 0, class35.field211, class35.field3026, 0, 0);
						}

						++field680;

						while (true) {
							class84 var39;
							class317 var40;
							class317 var43;
							do {
								var39 = (class84)field700.method6714();
								if (var39 == null) {
									while (true) {
										do {
											var39 = (class84)field701.method6714();
											if (var39 == null) {
												while (true) {
													do {
														var39 = (class84)field699.method6714();
														if (null == var39) {
															while (true) {
																class207 var42 = (class207)field702.method6714();
																if (var42 == null) {
																	this.method1363();
																	method723();
																	if (field511 != null) {
																		this.method1254();
																	}

																	if (class223.method4409()) {
																		var5 = class223.field2579;
																		var6 = class223.field2580;
																		var29 = class331.method6337(class287.field3158, field753.field1385);
																		var29.field3212.method8695(5);
																		var29.field3212.method8859(field2841 + var6);
																		var29.field3212.method8734(field2850 + var5);
																		var29.field3212.method8805(field722.method4076(82) ? (field722.method4076(81) ? 2 : 1) : 0);
																		field753.method2735(var29);
																		class223.method4408();
																		field515 = class36.field250;
																		field676 = class36.field251;
																		field607 = 1;
																		field606 = 0;
																		field735 = var5;
																		field487 = var6;
																	}

																	if (var35 != field3394) {
																		if (var35 != null) {
																			method3176(var35);
																		}

																		if (null != field3394) {
																			method3176(field3394);
																		}
																	}

																	if (field1575 != var37 && field648 == field647) {
																		if (null != var37) {
																			method3176(var37);
																		}

																		if (field1575 != null) {
																			method3176(field1575);
																		}
																	}

																	if (null != field1575) {
																		if (field647 < field648) {
																			++field647;
																			if (field647 == field648) {
																				method3176(field1575);
																			}
																		}
																	} else if (field647 > 0) {
																		--field647;
																	}

																	if (field505 == 0) {
																		var5 = field3454.field1171;
																		var6 = field3454.field1138;
																		if (field194 - var5 < -500 || field194 - var5 > 500 || field1675 - var6 < -500 || field1675 - var6 > 500) {
																			field194 = var5;
																			field1675 = var6;
																		}

																		if (var5 != field194) {
																			field194 += (var5 - field194) / 16;
																		}

																		if (field1675 != var6) {
																			field1675 += (var6 - field1675) / 16;
																		}

																		var7 = field194 >> 7;
																		var8 = field1675 >> 7;
																		var9 = class148.method3196(field194, field1675, field231);
																		var10 = 0;
																		if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
																			for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																				for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																					var13 = field231;
																					if (var13 < 3 && 2 == (class78.field1006[1][var11][var12] & 2)) {
																						++var13;
																					}

																					int var14 = var9 - class78.field1002[var13][var11][var12];
																					if (var14 > var10) {
																						var10 = var14;
																					}
																				}
																			}
																		}

																		var11 = var10 * 192;
																		if (var11 > 98048) {
																			var11 = 98048;
																		}

																		if (var11 < 32768) {
																			var11 = 32768;
																		}

																		if (var11 > field589) {
																			field589 += (var11 - field589) / 24;
																		} else if (var11 < field589) {
																			field589 += (var11 - field589) / 80;
																		}

																		field1297 = class148.method3196(field3454.field1171, field3454.field1138, field231) - field771;
																	} else if (1 == field505) {
																		method6321();
																		short var45 = -1;
																		if (field722.method4076(33)) {
																			var45 = 0;
																		} else if (field722.method4076(49)) {
																			var45 = 1024;
																		}

																		if (field722.method4076(48)) {
																			if (var45 == 0) {
																				var45 = 1792;
																			} else if (var45 == 1024) {
																				var45 = 1280;
																			} else {
																				var45 = 1536;
																			}
																		} else if (field722.method4076(50)) {
																			if (var45 == 0) {
																				var45 = 256;
																			} else if (var45 == 1024) {
																				var45 = 768;
																			} else {
																				var45 = 512;
																			}
																		}

																		byte var44 = 0;
																		if (field722.method4076(35)) {
																			var44 = -1;
																		} else if (field722.method4076(51)) {
																			var44 = 1;
																		}

																		var7 = 0;
																		if (var45 >= 0 || var44 != 0) {
																			var7 = field722.method4076(81) ? field711 : field583;
																			var7 *= 16;
																			field729 = var45;
																			field531 = var44;
																		}

																		if (field778 < var7) {
																			field778 += var7 / 8;
																			if (field778 > var7) {
																				field778 = var7;
																			}
																		} else if (field778 > var7) {
																			field778 = field778 * 9 / 10;
																		}

																		if (field778 > 0) {
																			var8 = field778 / 16;
																			if (field729 >= 0) {
																				var5 = field729 - field1531 & 2047;
																				var9 = class219.field2512[var5];
																				var10 = class219.field2516[var5];
																				field194 += var8 * var9 / 65536;
																				field1675 += var10 * var8 / 65536;
																			}

																			if (field531 != 0) {
																				field1297 += field531 * var8;
																				if (field1297 > 0) {
																					field1297 = 0;
																				}
																			}
																		} else {
																			field729 = -1;
																			field531 = -1;
																		}

																		if (field722.method4076(13)) {
																			method333();
																		}
																	}

																	if (class36.field232 == 4 && field4941) {
																		var5 = class36.field243 - field681;
																		field575 = var5 * 2;
																		field681 = var5 != -1 && var5 != 1 ? (field681 + class36.field243) / 2 : class36.field243;
																		var6 = field580 - class36.field242;
																		field704 = var6 * 2;
																		field580 = var6 != -1 && var6 != 1 ? (field580 + class36.field242) / 2 : class36.field242;
																	} else {
																		if (field722.method4076(96)) {
																			field704 += (-24 - field704) / 2;
																		} else if (field722.method4076(97)) {
																			field704 += (24 - field704) / 2;
																		} else {
																			field704 /= 2;
																		}

																		if (field722.method4076(98)) {
																			field575 += (12 - field575) / 2;
																		} else if (field722.method4076(99)) {
																			field575 += (-12 - field575) / 2;
																		} else {
																			field575 /= 2;
																		}

																		field681 = class36.field243;
																		field580 = class36.field242;
																	}

																	field758 = field704 / 2 + field758 & 2047;
																	field595 += field575 / 2;
																	if (field595 < 128) {
																		field595 = 128;
																	}

																	if (field595 > 383) {
																		field595 = 383;
																	}

																	if (field732) {
																		method13();
																	} else if (field746) {
																		if (!field674) {
																			var5 = 64 + field1903 * 128;
																			var6 = field1500 * 128 + 64;
																			var7 = class148.method3196(var5, var6, field231) - field91;
																			class134.method3102(var5, var7, var6);
																		} else if (null != field668) {
																			field257 = field668.method8107();
																			field3391 = field668.method8102();
																			if (field749) {
																				field1867 = field668.method8103();
																			} else {
																				field1867 = class148.method3196(field257, field3391, field231) - field668.method8103();
																			}

																			field668.method8110();
																		}

																		if (!field748) {
																			var5 = field4885 * 128 + 64;
																			var6 = field1872 * 128 + 64;
																			var7 = class148.method3196(var5, var6, field231) - field470;
																			var8 = var5 - field257;
																			var9 = var7 - field1867;
																			var10 = var6 - field3391;
																			var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
																			var12 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
																			var13 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
																			class68.method1970(var12, var13);
																		} else {
																			if (null != field738) {
																				field2975 = field738.method8096();
																				field2975 = Math.min(Math.max(field2975, 128), 383);
																				field738.method8110();
																			}

																			if (field751 != null) {
																				field1531 = field751.method8096() & 2047;
																				field751.method8110();
																			}
																		}
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		var10002 = field585[var5]++;
																	}

																	field4387.method2693();
																	var5 = class36.method2072();
																	var6 = class35.field217.method355();
																	if (var5 > 15000 && var6 > 15000) {
																		field761 = 250;
																		class36.field239 = 14500;
																		var38 = class331.method6337(class287.field3182, field753.field1385);
																		field753.method2735(var38);
																	}

																	class67.field804.method1825();

																	for (var8 = 0; var8 < field783.size(); ++var8) {
																		if (class21.method305((Integer)field783.get(var8)) != 2) {
																			field783.remove(var8);
																			--var8;
																		}
																	}

																	++field753.field1391;
																	if (field753.field1391 > 50) {
																		var38 = class331.method6337(class287.field3189, field753.field1385);
																		field753.method2735(var38);
																	}

																	try {
																		field753.method2751();
																	} catch (IOException var15) {
																		method6595();
																	}

																	return;
																}

																class403.method7506(var42);
															}
														}

														var40 = var39.field1048;
														if (var40.field3571 < 0) {
															break;
														}

														var43 = class166.method3349(var40.field3589);
													} while(var43 == null || var43.field3707 == null || var40.field3571 >= var43.field3707.length || var40 != var43.field3707[var40.field3571]);

													class67.method2351(var39);
												}
											}

											var40 = var39.field1048;
											if (var40.field3571 < 0) {
												break;
											}

											var43 = class166.method3349(var40.field3589);
										} while(var43 == null || var43.field3707 == null || var40.field3571 >= var43.field3707.length || var40 != var43.field3707[var40.field3571]);

										class67.method2351(var39);
									}
								}

								var40 = var39.field1048;
								if (var40.field3571 < 0) {
									break;
								}

								var43 = class166.method3349(var40.field3589);
							} while(null == var43 || null == var43.field3707 || var40.field3571 >= var43.field3707.length || var40 != var43.field3707[var40.field3571]);

							class67.method2351(var39);
						}
					}

					var17 = class331.method6337(class287.field3184, field753.field1385);
					var17.field3212.method8695(0);
					var4 = var17.field3212.field4989;
					class433.method7995(var17.field3212);
					var17.field3212.method8655(var17.field3212.field4989 - var4);
					field753.method2735(var17);
				}
			}
		}
	}

	protected final void method527() {
		field714 = class294.method2575() + 500L;
		this.method1245();
		if (-1 != field656) {
			this.method1252(true);
		}

	}

	void method1245() {
		int var2 = class35.field211;
		int var3 = class35.field3026;
		if (super.field207 < var2) {
			var2 = super.field207;
		}

		if (super.field209 < var3) {
			var3 = super.field209;
		}

		if (field112 != null) {
			try {
				class27.method395(field466, "resize", new Object[]{method6581()});
			} catch (Throwable var5) {
			}
		}

	}

	final void method1246() {
		int var2;
		if (-1 != field656) {
			var2 = field656;
			if (class45.method882(var2)) {
				class100.method2606(field2057[var2], -1);
			}
		}

		for (var2 = 0; var2 < field781; ++var2) {
			if (field706[var2]) {
				field707[var2] = true;
			}

			field652[var2] = field706[var2];
			field706[var2] = false;
		}

		field660 = field602;
		field645 = -1;
		field646 = -1;
		if (-1 != field656) {
			field781 = 0;
			class14.method166(field656, 0, 0, class35.field211, class35.field3026, 0, 0, -1);
		}

		class499.method8980();
		if (field696) {
			if (field607 == 1) {
				field1861[field606 / 100].method9106(field515 - 8, field676 - 8);
			}

			if (field607 == 2) {
				field1861[4 + field606 / 100].method9106(field515 - 8, field676 - 8);
			}
		}

		if (!field669) {
			if (-1 != field645) {
				class86.method2219(field645, field646);
			}
		} else {
			var2 = field2065;
			int var3 = field1020;
			int var4 = field4753;
			int var5 = field1693;
			int var6 = 6116423;
			class499.method9012(var2, var3, var4, var5, var6);
			class499.method9012(var2 + 1, var3 + 1, var4 - 2, 16, 0);
			class499.method9041(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
			field1635.method7228(class337.field4114, var2 + 3, var3 + 14, var6, -1);
			int var7 = class36.field242;
			int var8 = class36.field243;

			for (int var9 = 0; var9 < field633; ++var9) {
				int var10 = var3 + 31 + 15 * (field633 - 1 - var9);
				int var11 = 16777215;
				if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
					var11 = 16776960;
				}

				field1635.method7228(class405.method7550(var9), var2 + 3, var10, var11, 0);
			}

			class404.method7507(field2065, field1020, field4753, field1693);
		}

		if (3 == field713) {
			for (var2 = 0; var2 < field781; ++var2) {
				if (field652[var2]) {
					class499.method8988(field709[var2], field710[var2], field640[var2], field712[var2], 16711935, 128);
				} else if (field707[var2]) {
					class499.method8988(field709[var2], field710[var2], field640[var2], field712[var2], 16711680, 128);
				}
			}
		}

		class325.method6322(field231, field3454.field1171, field3454.field1138, field565);
		field565 = 0;
	}

	boolean method1247(class107 var1, int var2) {
		if (0 == var1.field1388) {
			class67.field1426 = null;
		} else {
			if (null == class67.field1426) {
				class67.field1426 = new class404(field889, field466);
			}

			class67.field1426.method7512(var1.field1386, var2);
		}

		field691 = field680;
		field865 = true;
		var1.field1382 = null;
		return true;
	}

	boolean method1248(class107 var1) {
		if (class67.field1426 != null) {
			class67.field1426.method7516(var1.field1386);
		}

		field691 = field680;
		field865 = true;
		var1.field1382 = null;
		return true;
	}

	final boolean method1333(class107 var1) {
		class414 var3 = var1.method2740();
		class488 var4 = var1.field1386;
		if (null == var3) {
			return false;
		} else {
			String var6;
			int var7;
			try {
				int var25;
				if (var1.field1382 == null) {
					if (var1.field1389) {
						if (!var3.method7729(1)) {
							return false;
						}

						var3.method7713(var1.field1386.field4991, 0, 1);
						var1.field1390 = 0;
						var1.field1389 = false;
					}

					var4.field4989 = 0;
					if (var4.method8623((byte)55)) {
						if (!var3.method7729(1)) {
							return false;
						}

						var3.method7713(var1.field1386.field4991, 1, 1);
						var1.field1390 = 0;
					}

					var1.field1389 = true;
					class290[] var5 = class290.method5504();
					var25 = var4.method8604();
					if (var25 < 0 || var25 >= var5.length) {
						throw new IOException(var25 + " " + var4.field4989);
					}

					var1.field1382 = var5[var25];
					var1.field1388 = var1.field1382.field3338;
				}

				if (var1.field1388 == -1) {
					if (!var3.method7729(1)) {
						return false;
					}

					var1.method2740().method7713(var4.field4991, 0, 1);
					var1.field1388 = var4.field4991[0] & 255;
				}

				if (var1.field1388 == -2) {
					if (!var3.method7729(2)) {
						return false;
					}

					var1.method2740().method7713(var4.field4991, 0, 2);
					var4.field4989 = 0;
					var1.field1388 = var4.method8660();
				}

				if (!var3.method7729(var1.field1388)) {
					return false;
				}

				var4.field4989 = 0;
				var3.method7713(var4.field4991, 0, var1.field1388);
				var1.field1390 = 0;
				field516.method7341();
				var1.field1387 = var1.field1393;
				var1.field1393 = var1.field1392;
				var1.field1392 = var1.field1382;
				int var23;
				if (var1.field1382 == class290.field3247) {
					var23 = var4.method8664();
					var25 = var4.method8664();
					var7 = class345.method6548();
					class289 var86 = class331.method6337(class287.field3166, field753.field1385);
					var86.field3212.method8688(class35.field204);
					var86.field3212.method8716(var7);
					var86.field3212.method8711(var23);
					var86.field3212.method8711(var25);
					field753.method2735(var86);
					var1.field1382 = null;
					return true;
				}

				int var14;
				byte var27;
				long var28;
				long var30;
				long var34;
				boolean var42;
				String var49;
				int var68;
				if (class290.field3238 == var1.field1382) {
					var27 = var4.method8659();
					var28 = (long)var4.method8660();
					var30 = (long)var4.method8662();
					var34 = var30 + (var28 << 32);
					var42 = false;
					class160 var67 = var27 >= 0 ? field679[var27] : field253;
					if (var67 == null) {
						var42 = true;
					} else {
						for (var14 = 0; var14 < 100; ++var14) {
							if (field786[var14] == var34) {
								var42 = true;
								break;
							}
						}
					}

					if (!var42) {
						field786[field721] = var34;
						field721 = (1 + field721) % 100;
						var49 = class235.method4753(var4);
						var68 = var27 >= 0 ? 43 : 46;
						class106.method3129(var68, "", var49, var67.field1773);
					}

					var1.field1382 = null;
					return true;
				}

				int var8;
				int var9;
				if (var1.field1382 == class290.field3219) {
					var23 = var4.method8713();
					var25 = var4.method8714();
					var7 = var4.method8701();
					if (var7 == 65535) {
						var7 = -1;
					}

					var8 = var4.method8700();
					if (var8 == 65535) {
						var8 = -1;
					}

					for (var9 = var8; var9 <= var7; ++var9) {
						var34 = ((long)var23 << 32) + (long)var9;
						class449 var59 = field703.method8381(var34);
						if (var59 != null) {
							var59.method8051();
						}

						field703.method8382(new class448(var25), var34);
					}

					var1.field1382 = null;
					return true;
				}

				class317 var50;
				if (class290.field3288 == var1.field1382) {
					var23 = var4.method8703();
					var25 = var4.method8712();
					var7 = var4.method8821();
					var50 = class166.method3349(var25);
					if (var23 != var50.field3579 || var7 != var50.field3580 || 0 != var50.field3609 || 0 != var50.field3576) {
						var50.field3579 = var23;
						var50.field3580 = var7;
						var50.field3609 = 0;
						var50.field3576 = 0;
						method3176(var50);
						this.method1349(var50);
						if (var50.field3598 == 0) {
							class242.method4836(field2057[var25 >> 16], var50, false);
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3309 == var1.field1382) {
					var23 = var4.method8691();
					var25 = var4.method8692();
					var7 = var4.method8664();
					var50 = class166.method3349(var7);
					class317.method2100(var50, var23, var25);
					method3176(var50);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3287 == var1.field1382) {
					var23 = var4.method8658();
					method5526(var23);
					var1.field1382 = null;
					return false;
				}

				if (class290.field3285 == var1.field1382) {
					var23 = var4.method8701();
					var25 = var4.method8660();
					var7 = var4.method8713();
					var50 = class166.method3349(var7);
					var50.field3627 = var25 + (var23 << 16);
					var1.field1382 = null;
					return true;
				}

				class96 var54;
				if (class290.field3311 == var1.field1382) {
					var23 = var4.method8660();
					var54 = field546[var23];
					var7 = var4.method8660();
					var25 = var4.method8664();
					if (null != var54) {
						var54.method2319(0, var7, var25 >> 16, var25 & 65535);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3273) {
					class188.method3621(class288.field3209);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3330 == var1.field1382) {
					var1.field1382 = null;
					return true;
				}

				class96 var44;
				if (var1.field1382 == class290.field3319) {
					var23 = var4.method8712();
					var25 = var4.method8700();
					short var88 = (short)var4.method8821();
					var8 = var4.method8692();
					var44 = field546[var25];
					if (null != var44) {
						var44.method2511(var8, var23, var88);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3223) {
					var23 = var4.method8660();
					class88 var81;
					if (var23 == field664) {
						var81 = field3454;
					} else {
						var81 = field611[var23];
					}

					var25 = var4.method8660();
					var7 = var4.method8664();
					if (var81 != null) {
						var81.method2319(0, var25, var7 >> 16, var7 & 65535);
					}

					var1.field1382 = null;
					return true;
				}

				String var65;
				boolean var91;
				if (class290.field3262 == var1.field1382) {
					var23 = var4.method8827();
					var91 = var4.method8658() == 1;
					var65 = "";
					boolean var77 = false;
					if (var91) {
						var65 = var4.method8669();
						if (class67.field804.method1781(new class513(var65, field889))) {
							var77 = true;
						}
					}

					String var70 = var4.method8669();
					if (!var77) {
						class106.method2852(var23, var65, var70);
					}

					var1.field1382 = null;
					return true;
				}

				class317 var26;
				if (var1.field1382 == class290.field3332) {
					var23 = var4.method8714();
					var25 = var4.method8714();
					var26 = class166.method3349(var23);
					class317.method5487(var26, var25);
					method3176(var26);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3240 == var1.field1382) {
					var23 = var4.method8664();
					var91 = var4.method8641() == 1;
					var26 = class166.method3349(var23);
					if (var26.field3590 != var91) {
						var26.field3590 = var91;
						method3176(var26);
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3280 == var1.field1382) {
					return this.method1248(var1);
				}

				if (var1.field1382 == class290.field3304) {
					class188.method3621(class288.field3203);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3258) {
					var23 = var4.method8712();
					var25 = var4.method8660();
					var26 = class166.method3349(var23);
					if (1 != var26.field3657 || var26.field3683 != var25) {
						var26.field3657 = 1;
						var26.field3683 = var25;
						method3176(var26);
					}

					var1.field1382 = null;
					return true;
				}

				int var10;
				int var11;
				if (class290.field3329 == var1.field1382) {
					field746 = true;
					field732 = false;
					field674 = true;
					field1903 = var4.method8658();
					field1500 = var4.method8658();
					var23 = var4.method8660();
					var25 = var4.method8660();
					field749 = var4.method8706();
					var7 = var4.method8658();
					var8 = field1903 * 128 + 64;
					var9 = 64 + field1500 * 128;
					boolean var62 = false;
					boolean var74 = false;
					if (field749) {
						var10 = field1867;
						var11 = class148.method3196(var8, var9, field231) - var23;
					} else {
						var10 = class148.method3196(field257, field3391, field231) - field1867;
						var11 = var23;
					}

					field668 = new class454(field257, field3391, var10, var8, var9, var11, var25, var7);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3283 == var1.field1382) {
					return this.method1247(var1, 2);
				}

				if (var1.field1382 == class290.field3337) {
					field4883 = var4.method8692();
					field44 = var4.method8658();

					while (var4.field4989 < var1.field1388) {
						var23 = var4.method8658();
						class288 var90 = class288.method2661()[var23];
						class188.method3621(var90);
					}

					var1.field1382 = null;
					return true;
				}

				class317 var47;
				if (class290.field3220 == var1.field1382) {
					var23 = var4.method8712();
					var47 = class166.method3349(var23);
					var47.field3657 = 3;
					var47.field3683 = field3454.field1097.method5807();
					method3176(var47);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3323 == var1.field1382) {
					var23 = var4.method8660();
					if (var23 == 65535) {
						var23 = -1;
					}

					field656 = var23;
					this.method1252(false);
					method5499(var23);
					class67.method164(field656);

					for (var25 = 0; var25 < 100; ++var25) {
						field706[var25] = true;
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3308 == var1.field1382) {
					class67.field804.method1830(var4, var1.field1388);
					field690 = field680;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3265) {
					field653 = var4.method8658();
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3227) {
					class188.method3621(class288.field3207);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3334) {
					field1340 = null;
					var1.field1382 = null;
					return true;
				}

				if (class290.field3257 == var1.field1382) {
					class188.method3621(class288.field3206);
					var1.field1382 = null;
					return true;
				}

				String var24;
				if (class290.field3231 == var1.field1382) {
					var24 = var4.method8669();
					Object[] var89 = new Object[var24.length() + 1];

					for (var7 = var24.length() - 1; var7 >= 0; --var7) {
						if (var24.charAt(var7) == 's') {
							var89[var7 + 1] = var4.method8669();
						} else {
							var89[var7 + 1] = new Integer(var4.method8664());
						}
					}

					var89[0] = new Integer(var4.method8664());
					class84 var87 = new class84();
					var87.field1052 = var89;
					class67.method2351(var87);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3305 == var1.field1382) {
					class346.method6554(var4, var1.field1388);
					method2220();
					var1.field1382 = null;
					return true;
				}

				int var16;
				int var17;
				String var63;
				class243 var69;
				if (class290.field3267 == var1.field1382) {
					var27 = var4.method8659();
					var6 = var4.method8669();
					long var84 = (long)var4.method8660();
					long var66 = (long)var4.method8662();
					class339 var72 = (class339)class199.method3788(class339.method6352(), var4.method8658());
					long var57 = var66 + (var84 << 32);
					boolean var58 = false;
					var69 = null;
					class160 var79 = var27 >= 0 ? field679[var27] : field253;
					if (var79 == null) {
						var58 = true;
					} else {
						var16 = 0;

						while (true) {
							if (var16 >= 100) {
								if (var72.field4170 && class67.field804.method1781(new class513(var6, field889))) {
									var58 = true;
								}
								break;
							}

							if (field786[var16] == var57) {
								var58 = true;
								break;
							}

							++var16;
						}
					}

					if (!var58) {
						field786[field721] = var57;
						field721 = (field721 + 1) % 100;
						var63 = class383.method7246(class235.method4753(var4));
						var17 = var27 >= 0 ? 41 : 44;
						if (var72.field4185 != -1) {
							class106.method3129(var17, class97.method6375(var72.field4185) + var6, var63, var79.field1773);
						} else {
							class106.method3129(var17, var6, var63, var79.field1773);
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3230) {
					var4.field4989 += 28;
					if (var4.method8687()) {
						method2805(var4, var4.field4989 - 28);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3261) {
					class128.method3047(false, var1.field1386);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3222 == var1.field1382) {
					var23 = var4.method8658();
					if (var4.method8658() == 0) {
						field776[var23] = new class353();
						var4.field4989 += 18;
					} else {
						--var4.field4989;
						field776[var23] = new class353(var4, false);
					}

					field763 = field680;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3276) {
					var23 = var4.method8704();
					var25 = var4.method8714();
					var26 = class166.method3349(var25);
					if (var23 != var26.field3618 || var23 == -1) {
						var26.field3618 = var23;
						var26.field3705 = 0;
						var26.field3706 = 0;
						method3176(var26);
					}

					var1.field1382 = null;
					return true;
				}

				boolean var36;
				if (var1.field1382 == class290.field3331) {
					var36 = var4.method8658() == 1;
					var25 = var4.method8664();
					var26 = class166.method3349(var25);
					class317.method2167(var26, field3454.field1097, var36);
					method3176(var26);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3272 == var1.field1382) {
					var23 = var4.method8737();
					var25 = var4.method8714();
					var7 = var23 >> 10 & 31;
					var8 = var23 >> 5 & 31;
					var9 = var23 & 31;
					var10 = (var7 << 19) + (var8 << 11) + (var9 << 3);
					class317 var71 = class166.method3349(var25);
					if (var71.field3595 != var10) {
						var71.field3595 = var10;
						method3176(var71);
					}

					var1.field1382 = null;
					return true;
				}

				int var12;
				int var55;
				if (var1.field1382 == class290.field3248) {
					var16 = var4.method8660();
					var68 = var4.method8692() * 4;
					int var19 = var4.method8641();
					byte var56 = var4.method8694();
					var14 = var4.method8641() * 4;
					var55 = var4.method8660();
					var17 = var4.method8701();
					var12 = var4.method8708();
					int var18 = var4.method8658();
					var7 = var4.method8707();
					var23 = var7 >> 16;
					var25 = var7 >> 8 & 255;
					var8 = var23 + (var7 >> 4 & 7);
					var9 = var25 + (var7 & 7);
					byte var64 = var4.method8659();
					var10 = var56 + var8;
					var11 = var64 + var9;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var55 != 65535) {
						var8 = var8 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						var11 = var11 * 128 + 64;
						class73 var20 = new class73(var55, field231, var8, var9, class148.method3196(var8, var9, field231) - var14, var16 + field602, field602 + var17, var18, var19, var12, var68);
						var20.method2052(var10, var11, class148.method3196(var10, var11, field231) - var68, var16 + field602);
						field551.method6711(var20);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3295) {
					class188.method3621(class288.field3200);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3326 == var1.field1382) {
					class67.field804.method1776();
					field690 = field680;
					var1.field1382 = null;
					return true;
				}

				class83 var29;
				long var43;
				if (class290.field3325 == var1.field1382) {
					var23 = var4.field4989 + var1.field1388;
					var25 = var4.method8660();
					if (var25 == 65535) {
						var25 = -1;
					}

					var7 = var4.method8660();
					if (field656 != var25) {
						field656 = var25;
						this.method1252(false);
						method5499(field656);
						class67.method164(field656);

						for (var8 = 0; var8 < 100; ++var8) {
							field706[var8] = true;
						}
					}

					class83 var51;
					for (; var7-- > 0; var51.field1039 = true) {
						var8 = var4.method8664();
						var9 = var4.method8660();
						var10 = var4.method8658();
						var51 = (class83)field657.method8381((long)var8);
						if (var51 != null && var9 != var51.field1037) {
							class358.method6676(var51, true);
							var51 = null;
						}

						if (null == var51) {
							var51 = method2601(var8, var9, var10);
						}
					}

					for (var29 = (class83)field657.method8387(); var29 != null; var29 = (class83)field657.method8384()) {
						if (var29.field1039) {
							var29.field1039 = false;
						} else {
							class358.method6676(var29, true);
						}
					}

					field703 = new class465(512);

					while (var4.field4989 < var23) {
						var8 = var4.method8664();
						var9 = var4.method8660();
						var10 = var4.method8660();
						var11 = var4.method8664();

						for (var12 = var9; var12 <= var10; ++var12) {
							var43 = ((long)var8 << 32) + (long)var12;
							field703.method8382(new class448(var11), var43);
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3289) {
					var23 = var4.method8658();
					var25 = var4.method8658();
					var7 = var4.method8658();
					var8 = var4.method8658();
					field754[var23] = true;
					field755[var23] = var25;
					field777[var23] = var7;
					field632[var23] = var8;
					field585[var23] = 0;
					var1.field1382 = null;
					return true;
				}

				if (class290.field3307 == var1.field1382) {
					var23 = var4.method8700();
					var7 = var4.method8691();
					var25 = var4.method8700();
					if (var25 == 65535) {
						var25 = -1;
					}

					var54 = field546[var23];
					if (null != var54) {
						if (var25 == var54.field1202 && var25 != -1) {
							var9 = class81.method2189(var25, (byte)28).field2315;
							if (var9 == 1) {
								var54.field1182 = 0;
								var54.field1183 = 0;
								var54.field1184 = var7;
								var54.field1185 = 0;
							} else if (var9 == 2) {
								var54.field1185 = 0;
							}
						} else if (var25 == -1 || -1 == var54.field1202 || class81.method2189(var25, (byte)38).field2294 >= class81.method2189(var54.field1202, (byte)25).field2294) {
							var54.field1202 = var25;
							var54.field1182 = 0;
							var54.field1183 = 0;
							var54.field1184 = var7;
							var54.field1185 = 0;
							var54.field1211 = var54.field1206;
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3291 == var1.field1382) {
					class115.method2868(var4, var1.field1388);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3271 == var1.field1382) {
					for (var23 = 0; var23 < field611.length; ++var23) {
						if (field611[var23] != null) {
							field611[var23].field1202 = -1;
						}
					}

					for (var23 = 0; var23 < field546.length; ++var23) {
						if (null != field546[var23]) {
							field546[var23].field1202 = -1;
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3244) {
					field4883 = var4.method8641();
					field44 = var4.method8692();
					var1.field1382 = null;
					return true;
				}

				if (class290.field3239 == var1.field1382) {
					class188.method3621(class288.field3204);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3269) {
					var36 = var4.method8706();
					if (var36) {
						if (null == class459.field1586) {
							class459.field1586 = new class355();
						}
					} else {
						class459.field1586 = null;
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3320) {
					field693 = field680;
					var27 = var4.method8659();
					class157 var85 = new class157(var4);
					class160 var80;
					if (var27 >= 0) {
						var80 = field679[var27];
					} else {
						var80 = field253;
					}

					var85.method3293(var80);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3235) {
					var23 = var4.method8664();
					var25 = var4.method8700();
					class307.field3481[var25] = var23;
					if (var23 != class307.field3482[var25]) {
						class307.field3482[var25] = var23;
					}

					class8.method54(var25);
					field740[++field514 - 1 & 31] = var25;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3317) {
					var23 = var4.method8664();
					var25 = var4.method8641();
					var26 = class166.method3349(var23);
					class163.method3330(var26, field3454.field1097.field3522, var25);
					method3176(var26);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3322 == var1.field1382) {
					field732 = false;
					field746 = false;
					field674 = false;
					field748 = false;
					field4885 = 0;
					field1872 = 0;
					field470 = 0;
					field749 = false;
					field4214 = 0;
					field1938 = 0;
					field1638 = 0;
					field138 = 0;
					field1903 = 0;
					field1500 = 0;
					field91 = 0;
					field668 = null;
					field738 = null;
					field751 = null;

					for (var23 = 0; var23 < 5; ++var23) {
						field754[var23] = false;
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3268 == var1.field1382) {
					var23 = var4.method8737();
					if (var23 == 65535) {
						var23 = -1;
					}

					class2.method11(var23);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3298) {
					var23 = var4.method8662();
					var25 = var4.method8737();
					if (var25 == 65535) {
						var25 = -1;
					}

					class209.method4118(var25, var23);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3315 == var1.field1382) {
					var23 = var4.method8714();
					var25 = var4.method8712();
					var7 = var4.method8701();
					if (var7 == 65535) {
						var7 = -1;
					}

					var50 = class166.method3349(var23);
					class202 var48;
					if (!var50.field3651) {
						if (var7 == -1) {
							var50.field3657 = 0;
							var1.field1382 = null;
							return true;
						}

						var48 = class92.method2352(var7);
						var50.field3657 = 4;
						var50.field3683 = var7;
						var50.field3622 = var48.field2225;
						var50.field3566 = var48.field2226;
						var50.field3619 = var48.field2224 * 100 / var25;
						method3176(var50);
					} else {
						var50.field3703 = var7;
						var50.field3637 = var25;
						var48 = class92.method2352(var7);
						var50.field3622 = var48.field2225;
						var50.field3566 = var48.field2226;
						var50.field3711 = var48.field2260;
						var50.field3620 = var48.field2228;
						var50.field3709 = var48.field2229;
						var50.field3619 = var48.field2224;
						if (var48.field2236 == 1) {
							var50.field3631 = 1;
						} else {
							var50.field3631 = 2;
						}

						if (var50.field3626 > 0) {
							var50.field3619 = var50.field3619 * 32 / var50.field3626;
						} else if (var50.field3581 > 0) {
							var50.field3619 = var50.field3619 * 32 / var50.field3581;
						}

						method3176(var50);
					}

					var1.field1382 = null;
					return true;
				}

				boolean var46;
				if (var1.field1382 == class290.field3270) {
					field746 = true;
					field732 = false;
					field674 = true;
					field1903 = var4.method8658();
					field1500 = var4.method8658();
					var23 = var4.method8660();
					var25 = var4.method8658() * 128 + 64;
					var7 = var4.method8658() * 128 + 64;
					var8 = var4.method8660();
					field749 = var4.method8706();
					var9 = var4.method8658();
					var10 = 64 + field1903 * 128;
					var11 = 64 + field1500 * 128;
					var42 = false;
					var46 = false;
					if (field749) {
						var12 = field1867;
						var55 = class148.method3196(var10, var11, field231) - var23;
					} else {
						var12 = class148.method3196(field257, field3391, field231) - field1867;
						var55 = var23;
					}

					field668 = new class453(field257, field3391, var12, var10, var11, var55, var25, var7, var8, var9);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3301 == var1.field1382) {
					if (-1 != field656) {
						class128.method3048(field656, 0);
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3293 == var1.field1382 && field746) {
					field732 = true;
					field748 = false;
					field674 = false;

					for (var23 = 0; var23 < 5; ++var23) {
						field754[var23] = false;
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3243) {
					field735 = var4.method8658();
					if (field735 == 255) {
						field735 = 0;
					}

					field487 = var4.method8658();
					if (255 == field487) {
						field487 = 0;
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3294 == var1.field1382) {
					field746 = true;
					field732 = false;
					field748 = true;
					var23 = var4.method8855();
					var25 = var4.method8855();
					var7 = class19.method291(field2975 + var25 & 2027);
					var8 = var23 + field1531;
					var9 = var4.method8660();
					var10 = var4.method8658();
					field738 = new class455(field2975, var7, var9, var10);
					field751 = new class455(field1531, var8, var9, var10);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3229) {
					field1340 = new class430(field882);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3278) {
					byte[] var78 = new byte[var1.field1388];
					var4.method8605(var78, 0, var78.length);
					class489 var83 = new class489(var78);
					var65 = var83.method8669();
					class411.method7690(var65, true, false);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3253 == var1.field1382) {
					field746 = true;
					field732 = false;
					field674 = false;
					field1903 = var4.method8658();
					field1500 = var4.method8658();
					field91 = var4.method8660();
					field138 = var4.method8658();
					field1638 = var4.method8658();
					if (field1638 >= 100) {
						field257 = field1903 * 128 + 64;
						field3391 = field1500 * 128 + 64;
						field1867 = class148.method3196(field257, field3391, field231) - field91;
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3286 == var1.field1382) {
					method724();
					var27 = var4.method8659();
					class143 var82 = new class143(var4);
					class151 var60;
					if (var27 >= 0) {
						var60 = field750[var27];
					} else {
						var60 = field2269;
					}

					var82.method3157(var60);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3241) {
					var23 = var4.method8660();
					var25 = var4.method8658();
					var7 = var4.method8660();
					method3071(var23, var25, var7);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3259 == var1.field1382) {
					var23 = var4.method8664();
					if (var23 != field577) {
						field577 = var23;
						method3456();
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3234) {
					method5492();
					field625 = var4.method8660();
					field566 = field680;
					var1.field1382 = null;
					return true;
				}

				if (class290.field3274 == var1.field1382) {
					var23 = var4.method8714();
					var25 = var4.method8701();
					var26 = class166.method3349(var23);
					if (null != var26 && 0 == var26.field3598) {
						if (var25 > var26.field3594 - var26.field3586) {
							var25 = var26.field3594 - var26.field3586;
						}

						if (var25 < 0) {
							var25 = 0;
						}

						if (var25 != var26.field3592) {
							var26.field3592 = var25;
							method3176(var26);
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3275 == var1.field1382) {
					var24 = var4.method8669();
					var25 = var4.method8714();
					var26 = class166.method3349(var25);
					if (!var24.equals(var26.field3716)) {
						var26.field3716 = var24;
						method3176(var26);
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3312 == var1.field1382) {
					method724();
					var27 = var4.method8659();
					if (1 == var1.field1388) {
						if (var27 >= 0) {
							field750[var27] = null;
						} else {
							field2269 = null;
						}

						var1.field1382 = null;
						return true;
					}

					if (var27 >= 0) {
						field750[var27] = new class151(var4);
					} else {
						field2269 = new class151(var4);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3335) {
					var8 = var4.method8658();
					var23 = var4.method8660();
					var44 = field546[var23];
					var7 = var4.method8660();
					var25 = var4.method8664();
					if (null != var44) {
						var44.method2319(var8, var7, var25 >> 16, var25 & 65535);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3264) {
					for (var23 = 0; var23 < class307.field3482.length; ++var23) {
						if (class307.field3481[var23] != class307.field3482[var23]) {
							class307.field3482[var23] = class307.field3481[var23];
							class8.method54(var23);
							field740[++field514 - 1 & 31] = var23;
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3296 == var1.field1382) {
					var23 = var4.method8664();
					var25 = var4.method8660();
					if (var23 < -70000) {
						var25 += 32768;
					}

					if (var23 >= 0) {
						var26 = class166.method3349(var23);
					} else {
						var26 = null;
					}

					for (; var4.field4989 < var1.field1388; class374.method6951(var25, var8, var9 - 1, var10, (byte)96)) {
						var8 = var4.method8827();
						var9 = var4.method8660();
						var10 = 0;
						if (var9 != 0) {
							var10 = var4.method8658();
							if (var10 == 255) {
								var10 = var4.method8664();
							}
						}

						if (null != var26 && var8 >= 0 && var8 < var26.field3613.length) {
							var26.field3613[var8] = var9;
							var26.field3702[var8] = var10;
						}
					}

					if (null != var26) {
						method3176(var26);
					}

					method5492();
					field720[++field684 - 1 & 31] = var25 & 32767;
					var1.field1382 = null;
					return true;
				}

				if (class290.field3221 == var1.field1382) {
					method480();
					var1.field1382 = null;
					return false;
				}

				if (var1.field1382 == class290.field3281) {
					return this.method1247(var1, 1);
				}

				if (class290.field3328 == var1.field1382) {
					field746 = true;
					field732 = false;
					field748 = true;
					var23 = method7926(var4.method8855() & 2027);
					var25 = class19.method291(var4.method8855() & 2027);
					var7 = var4.method8660();
					var8 = var4.method8658();
					field738 = new class455(field2975, var25, var7, var8);
					field751 = new class455(field1531, var23, var7, var8);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3333 == var1.field1382) {
					method5492();
					field683 = var4.method8855();
					field566 = field680;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3256) {
					class188.method3621(class288.field3205);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3314) {
					field4883 = var4.method8658();
					field44 = var4.method8691();

					for (var23 = field44; var23 < 8 + field44; ++var23) {
						for (var25 = field4883; var25 < field4883 + 8; ++var25) {
							if (null != field624[field231][var23][var25]) {
								field624[field231][var23][var25] = null;
								class122.method2927(var23, var25);
							}
						}
					}

					for (class90 var52 = (class90)field574.method6716(); null != var52; var52 = (class90)field574.method6725()) {
						if (var52.field1121 >= field44 && var52.field1121 < 8 + field44 && var52.field1122 >= field4883 && var52.field1122 < 8 + field4883 && var52.field1131 == field231) {
							var52.field1132 = 0;
						}
					}

					var1.field1382 = null;
					return true;
				}

				class317 var35;
				if (class290.field3318 == var1.field1382) {
					var23 = var4.method8714();
					var25 = var4.method8714();
					class83 var41 = (class83)field657.method8381((long)var23);
					var29 = (class83)field657.method8381((long)var25);
					if (var29 != null) {
						class358.method6676(var29, var41 == null || var29.field1037 != var41.field1037);
					}

					if (var41 != null) {
						var41.method8051();
						field657.method8382(var41, (long)var25);
					}

					var35 = class166.method3349(var23);
					if (var35 != null) {
						method3176(var35);
					}

					var35 = class166.method3349(var25);
					if (var35 != null) {
						method3176(var35);
						class242.method4836(field2057[var35.field3570 >>> 16], var35, true);
					}

					if (-1 != field656) {
						class128.method3048(field656, 1);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3316) {
					class64 var45 = new class64();
					var45.field799 = var4.method8669();
					var45.field802 = var4.method8660();
					var25 = var4.method8664();
					var45.field797 = var25;
					class139.method3145(45);
					var3.method7711();
					var3 = null;
					class203.method3974(var45);
					var1.field1382 = null;
					return false;
				}

				if (class290.field3279 == var1.field1382) {
					class147.method3190(true, var4);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3224 == var1.field1382) {
					class188.method3621(class288.field3197);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3299) {
					var23 = var4.method8664();
					var47 = class166.method3349(var23);

					for (var7 = 0; var7 < var47.field3613.length; ++var7) {
						var47.field3613[var7] = -1;
						var47.field3613[var7] = 0;
					}

					method3176(var47);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3321 == var1.field1382) {
					field746 = true;
					field732 = false;
					field748 = false;
					field4885 = var4.method8658();
					field1872 = var4.method8658();
					field470 = var4.method8660();
					field4214 = var4.method8658();
					field1938 = var4.method8658();
					if (field1938 >= 100) {
						var23 = 64 + field4885 * 128;
						var25 = 64 + field1872 * 128;
						var7 = class148.method3196(var23, var25, field231) - field470;
						var8 = var23 - field257;
						var9 = var7 - field1867;
						var10 = var25 - field3391;
						var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
						field2975 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
						field1531 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
						if (field2975 < 128) {
							field2975 = 128;
						}

						if (field2975 > 383) {
							field2975 = 383;
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3225 == var1.field1382) {
					class60.method1167(var4.method8669());
					var1.field1382 = null;
					return true;
				}

				if (class290.field3336 == var1.field1382) {
					var8 = var4.method8658();
					var23 = var4.method8660();
					class88 var38;
					if (var23 == field664) {
						var38 = field3454;
					} else {
						var38 = field611[var23];
					}

					var25 = var4.method8660();
					var7 = var4.method8664();
					if (var38 != null) {
						var38.method2319(var8, var25, var7 >> 16, var7 & 65535);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3254) {
					class188.method3621(class288.field3201);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3232 == var1.field1382) {
					method5492();
					var23 = var4.method8641();
					var25 = var4.method8641();
					var7 = var4.method8712();
					field630[var23] = var7;
					field743[var23] = var25;
					field629[var23] = 1;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var7 >= class327.field3773[var8]) {
							field629[var23] = var8 + 2;
						}
					}

					field685[++field686 - 1 & 31] = var23;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3260) {
					class128.method3047(true, var1.field1386);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3263 == var1.field1382) {
					var23 = var4.method8701();
					var25 = var4.method8700();
					var7 = var4.method8713();
					var8 = var4.method8660();
					var35 = class166.method3349(var7);
					if (var25 != var35.field3622 || var35.field3566 != var23 || var8 != var35.field3619) {
						var35.field3622 = var25;
						var35.field3566 = var23;
						var35.field3619 = var8;
						method3176(var35);
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3284 == var1.field1382) {
					var10 = var4.method8658();
					var11 = var10 >> 2;
					var12 = var10 & 3;
					var55 = field564[var11];
					var7 = var4.method8686();
					var23 = var7 >> 16;
					var25 = var7 >> 8 & 255;
					var8 = var23 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var25;
					var14 = var4.method8737();
					if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
						if (var55 == 0) {
							class240 var76 = field180.method4390(field231, var8, var9);
							if (null != var76) {
								var16 = class233.method2194(var76.field2816);
								if (var11 == 2) {
									var76.field2813 = new class76(var16, 2, var12 + 4, field231, var8, var9, var14, false, var76.field2813);
									var76.field2817 = new class76(var16, 2, var12 + 1 & 3, field231, var8, var9, var14, false, var76.field2817);
								} else {
									var76.field2813 = new class76(var16, var11, var12, field231, var8, var9, var14, false, var76.field2813);
								}
							}
						} else if (var55 == 1) {
							class242 var75 = field180.method4391(field231, var8, var9);
							if (var75 != null) {
								var16 = class233.method2194(var75.field2822);
								if (var11 != 4 && var11 != 5) {
									if (var11 == 6) {
										var75.field2828 = new class76(var16, 4, var12 + 4, field231, var8, var9, var14, false, var75.field2828);
									} else if (var11 == 7) {
										var75.field2828 = new class76(var16, 4, 4 + (var12 + 2 & 3), field231, var8, var9, var14, false, var75.field2828);
									} else if (var11 == 8) {
										var75.field2828 = new class76(var16, 4, var12 + 4, field231, var8, var9, var14, false, var75.field2828);
										var75.field2826 = new class76(var16, 4, (var12 + 2 & 3) + 4, field231, var8, var9, var14, false, var75.field2826);
									}
								} else {
									var75.field2828 = new class76(var16, 4, var12, field231, var8, var9, var14, false, var75.field2828);
								}
							}
						} else if (var55 == 2) {
							var69 = field180.method4446(field231, var8, var9);
							if (var11 == 11) {
								var11 = 10;
							}

							if (null != var69) {
								var69.field2838 = new class76(class233.method2194(var69.field2846), var11, var12, field231, var8, var9, var14, false, var69.field2838);
							}
						} else if (var55 == 3) {
							class215 var73 = field180.method4393(field231, var8, var9);
							if (var73 != null) {
								var73.field2460 = new class76(class233.method2194(var73.field2461), 22, var12, field231, var8, var9, var14, false, var73.field2460);
							}
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3252) {
					class188.method3621(class288.field3202);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3282 == var1.field1382) {
					var23 = var4.method8658();
					method4851(var23);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3277 == var1.field1382) {
					var36 = var4.method8658() == 1;
					if (var36) {
						class19.field3741 = class294.method2575() - var4.method8681();
						class19.field4389 = new class346(var4, true);
					} else {
						class19.field4389 = null;
					}

					field769 = field680;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3327) {
					field746 = true;
					field732 = false;
					field748 = true;
					field4885 = var4.method8658();
					field1872 = var4.method8658();
					field470 = var4.method8660();
					var23 = var4.method8660();
					var25 = var4.method8658();
					var7 = 64 + field4885 * 128;
					var8 = field1872 * 128 + 64;
					var9 = class148.method3196(var7, var8, field231) - field470;
					var10 = var7 - field257;
					var11 = var9 - field1867;
					var12 = var8 - field3391;
					double var53 = Math.sqrt((double)(var12 * var12 + var10 * var10));
					var68 = class19.method291((int)(Math.atan2((double)var11, var53) * 325.9490051269531D) & 2047);
					var16 = method7926((int)(Math.atan2((double)var10, (double)var12) * -325.9490051269531D) & 2047);
					field738 = new class455(field2975, var68, var23, var25);
					field751 = new class455(field1531, var16, var23, var25);
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3226) {
					class67.field2100 = class508.method7469(var4.method8658());
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3292) {
					class67.field804.field812.method7472(var4, var1.field1388);
					method2045();
					field690 = field680;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3255) {
					class147.method3190(false, var4);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3245 == var1.field1382) {
					if (field1340 == null) {
						field1340 = new class430(field882);
					}

					class498 var31 = field882.method7962(var4);
					field1340.field4698.method8399(var31.field5059, var31.field5058);
					field687[++field688 - 1 & 31] = var31.field5059;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3303) {
					var27 = var4.method8834();
					var25 = var4.method8660();
					class307.field3481[var25] = var27;
					if (class307.field3482[var25] != var27) {
						class307.field3482[var25] = var27;
					}

					class8.method54(var25);
					field740[++field514 - 1 & 31] = var25;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3233) {
					var23 = var4.method8700();
					class408.method7593(var23);
					field720[++field684 - 1 & 31] = var23 & 32767;
					var1.field1382 = null;
					return true;
				}

				if (class290.field3251 == var1.field1382) {
					var23 = var4.method8701();
					var25 = var4.method8712();
					var26 = class166.method3349(var25);
					if (var26.field3657 != 6 || var26.field3683 != var23) {
						var26.field3657 = 6;
						var26.field3683 = var23;
						method3176(var26);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3246) {
					var24 = var4.method8669();
					var28 = (long)var4.method8660();
					var30 = (long)var4.method8662();
					class339 var37 = (class339)class199.method3788(class339.method6352(), var4.method8658());
					long var40 = var30 + (var28 << 32);
					var46 = false;

					for (var14 = 0; var14 < 100; ++var14) {
						if (field786[var14] == var40) {
							var46 = true;
							break;
						}
					}

					if (class67.field804.method1781(new class513(var24, field889))) {
						var46 = true;
					}

					if (!var46 && 0 == field609) {
						field786[field721] = var40;
						field721 = (1 + field721) % 100;
						var49 = class383.method7246(class372.method2897(class235.method4753(var4)));
						byte var61;
						if (var37.field4186) {
							var61 = 7;
						} else {
							var61 = 3;
						}

						if (var37.field4185 != -1) {
							class106.method2852(var61, class97.method6375(var37.field4185) + var24, var49);
						} else {
							class106.method2852(var61, var24, var49);
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3266 == var1.field1382) {
					var23 = var4.method8701();
					var25 = var4.method8713();
					var26 = class166.method3349(var25);
					if (var26.field3657 != 2 || var23 != var26.field3683) {
						var26.field3657 = 2;
						var26.field3683 = var23;
						method3176(var26);
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3297 == var1.field1382) {
					field693 = field680;
					var27 = var4.method8659();
					if (1 == var1.field1388) {
						if (var27 >= 0) {
							field679[var27] = null;
						} else {
							field253 = null;
						}

						var1.field1382 = null;
						return true;
					}

					if (var27 >= 0) {
						field679[var27] = new class160(var4);
					} else {
						field253 = new class160(var4);
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3310 == var1.field1382) {
					for (var23 = 0; var23 < field1909; ++var23) {
						class182 var33 = class182.method7787(var23);
						if (null != var33) {
							class307.field3481[var23] = 0;
							class307.field3482[var23] = 0;
						}
					}

					method5492();
					field514 += 32;
					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3306) {
					var23 = var4.method8664();
					class83 var32 = (class83)field657.method8381((long)var23);
					if (var32 != null) {
						class358.method6676(var32, true);
					}

					if (field661 != null) {
						method3176(field661);
						field661 = null;
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3228) {
					var23 = var4.method8641();
					var6 = var4.method8669();
					var7 = var4.method8641();
					if (var23 >= 1 && var23 <= 8) {
						if (var6.equalsIgnoreCase(class337.field3889)) {
							var6 = null;
						}

						field736[var23 - 1] = var6;
						field588[var23 - 1] = var7 == 0;
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3218) {
					var24 = var4.method8669();
					var6 = class383.method7246(class372.method2897(class235.method4753(var4)));
					class106.method2852(6, var24, var6);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3236 == var1.field1382) {
					var24 = var4.method8669();
					var28 = var4.method8681();
					var30 = (long)var4.method8660();
					var34 = (long)var4.method8662();
					class339 var39 = (class339)class199.method3788(class339.method6352(), var4.method8658());
					var43 = var34 + (var30 << 32);
					boolean var15 = false;

					for (var16 = 0; var16 < 100; ++var16) {
						if (field786[var16] == var43) {
							var15 = true;
							break;
						}
					}

					if (var39.field4170 && class67.field804.method1781(new class513(var24, field889))) {
						var15 = true;
					}

					if (!var15 && field609 == 0) {
						field786[field721] = var43;
						field721 = (1 + field721) % 100;
						var63 = class383.method7246(class372.method2897(class235.method4753(var4)));
						if (-1 != var39.field4185) {
							class106.method3129(9, class97.method6375(var39.field4185) + var24, var63, class195.method3721(var28));
						} else {
							class106.method3129(9, var24, var63, class195.method3721(var28));
						}
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3324) {
					var11 = var4.method8658();
					var12 = var4.method8701();
					var7 = var4.method8686();
					var23 = var7 >> 16;
					var25 = var7 >> 8 & 255;
					var8 = var23 + (var7 >> 4 & 7);
					var9 = (var7 & 7) + var25;
					var10 = var4.method8660();
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
						var8 = 64 + var8 * 128;
						var9 = var9 * 128 + 64;
						class68 var13 = new class68(var10, field231, var8, var9, class148.method3196(var8, var9, field231) - var11, var12, field602);
						field627.method6711(var13);
					}

					var1.field1382 = null;
					return true;
				}

				if (var1.field1382 == class290.field3302) {
					field717 = var4.method8641();
					field578 = var4.method8658();
					var1.field1382 = null;
					return true;
				}

				if (class290.field3290 == var1.field1382) {
					field545 = var4.method8737() * 30;
					field566 = field680;
					var1.field1382 = null;
					return true;
				}

				if (class290.field3237 == var1.field1382) {
					field508 = var4.method8658();
					if (1 == field508) {
						field509 = var4.method8660();
					}

					if (field508 >= 2 && field508 <= 6) {
						if (field508 == 2) {
							field766 = 64;
							field705 = 64;
						}

						if (3 == field508) {
							field766 = 0;
							field705 = 64;
						}

						if (field508 == 4) {
							field766 = 128;
							field705 = 64;
						}

						if (5 == field508) {
							field766 = 64;
							field705 = 0;
						}

						if (6 == field508) {
							field766 = 64;
							field705 = 128;
						}

						field508 = 2;
						field654 = var4.method8660();
						field512 = var4.method8660();
						field547 = var4.method8658();
					}

					if (10 == field508) {
						field510 = var4.method8660();
					}

					var1.field1382 = null;
					return true;
				}

				if (class290.field3249 == var1.field1382) {
					var23 = var4.method8692();
					var25 = var4.method8737();
					var7 = var4.method8713();
					var29 = (class83)field657.method8381((long)var7);
					if (null != var29) {
						class358.method6676(var29, var25 != var29.field1037);
					}

					method2601(var7, var25, var23);
					var1.field1382 = null;
					return true;
				}

				if (class290.field3250 == var1.field1382) {
					var23 = var4.method8664();
					var25 = var4.method8660();
					if (var23 < -70000) {
						var25 += 32768;
					}

					if (var23 >= 0) {
						var26 = class166.method3349(var23);
					} else {
						var26 = null;
					}

					if (var26 != null) {
						for (var8 = 0; var8 < var26.field3613.length; ++var8) {
							var26.field3613[var8] = 0;
							var26.field3702[var8] = 0;
						}
					}

					class81.method4981(var25);
					var8 = var4.method8660();

					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var4.method8737();
						var11 = var4.method8641();
						if (var11 == 255) {
							var11 = var4.method8713();
						}

						if (null != var26 && var9 < var26.field3613.length) {
							var26.field3613[var9] = var10;
							var26.field3702[var9] = var11;
						}

						class374.method6951(var25, var9, var10 - 1, var11, (byte)75);
					}

					if (var26 != null) {
						method3176(var26);
					}

					method5492();
					field720[++field684 - 1 & 31] = var25 & 32767;
					var1.field1382 = null;
					return true;
				}

				if (class290.field3313 == var1.field1382) {
					class188.method3621(class288.field3198);
					var1.field1382 = null;
					return true;
				}

				class388.method7339("" + (null != var1.field1382 ? 1287795301 * var1.field1382.field3300 * 1490038637 : -1) + class97.field1295 + (null != var1.field1393 ? 1287795301 * var1.field1393.field3300 * 1490038637 : -1) + class97.field1295 + (null != var1.field1387 ? 1287795301 * var1.field1387.field3300 * 1490038637 : -1) + class97.field1295 + var1.field1388, (Throwable)null);
				method480();
			} catch (IOException var21) {
				method6595();
			} catch (Exception var22) {
				var6 = "" + (var1.field1382 != null ? 1287795301 * var1.field1382.field3300 * 1490038637 : -1) + class97.field1295 + (var1.field1393 != null ? 1287795301 * var1.field1393.field3300 * 1490038637 : -1) + class97.field1295 + (null != var1.field1387 ? 1287795301 * var1.field1387.field3300 * 1490038637 : -1) + class97.field1295 + var1.field1388 + class97.field1295 + (field3454.field1174[0] + field2850) + class97.field1295 + (field2841 + field3454.field1176[0]) + class97.field1295;

				for (var7 = 0; var7 < var1.field1388 && var7 < 50; ++var7) {
					var6 = var6 + var4.field4991[var7] + class97.field1295;
				}

				class388.method7339(var6, var22);
				method480();
			}

			return true;
		}
	}

	final void method1363() {
		method7928();
		if (field511 == null) {
			int var2 = class36.field252;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			if (field669) {
				int var9;
				if (var2 != 1 && (field4941 || var2 != 4)) {
					var3 = class36.field242;
					var4 = class36.field243;
					if (var3 < field2065 - 10 || var3 > field4753 + field2065 + 10 || var4 < field1020 - 10 || var4 > field1020 + field1693 + 10) {
						field669 = false;
						var5 = field2065;
						var6 = field1020;
						var7 = field4753;
						var8 = field1693;

						for (var9 = 0; var9 < field781; ++var9) {
							if (field640[var9] + field709[var9] > var5 && field709[var9] < var5 + var7 && field712[var9] + field710[var9] > var6 && field710[var9] < var8 + var6) {
								field706[var9] = true;
							}
						}
					}
				}

				if (var2 == 1 || !field4941 && var2 == 4) {
					var3 = field2065;
					var4 = field1020;
					var5 = field4753;
					var6 = class36.field250;
					var7 = class36.field251;
					var8 = -1;

					int var10;
					for (var9 = 0; var9 < field633; ++var9) {
						var10 = (field633 - 1 - var9) * 15 + var4 + 31;
						if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
							var8 = var9;
						}
					}

					int var11;
					int var12;
					int var13;
					if (var8 != -1 && var8 >= 0) {
						var9 = field634[var8];
						var10 = field635[var8];
						var11 = field636[var8];
						var12 = field637[var8];
						var13 = field638[var8];
						String var14 = field639[var8];
						String var15 = field581[var8];
						class18.method250(var9, var10, var11, var12, var13, var14, var15, class36.field250, class36.field251);
					}

					field669 = false;
					var9 = field2065;
					var10 = field1020;
					var11 = field4753;
					var12 = field1693;

					for (var13 = 0; var13 < field781; ++var13) {
						if (field640[var13] + field709[var13] > var9 && field709[var13] < var11 + var9 && field710[var13] + field712[var13] > var10 && field710[var13] < var10 + var12) {
							field706[var13] = true;
						}
					}
				}
			} else {
				var3 = method2086();
				if ((var2 == 1 || !field4941 && var2 == 4) && this.method1250()) {
					var2 = 2;
				}

				if ((var2 == 1 || !field4941 && var2 == 4) && field633 > 0 && var3 >= 0) {
					var4 = field634[var3];
					var5 = field635[var3];
					var6 = field636[var3];
					var7 = field637[var3];
					var8 = field638[var3];
					String var16 = field639[var3];
					String var17 = field581[var3];
					class18.method250(var4, var5, var6, var7, var8, var16, var17, class36.field250, class36.field251);
				}

				if (var2 == 2 && field633 > 0) {
					this.method1511(class36.field250, class36.field251);
				}
			}

		}
	}

	final boolean method1250() {
		int var2 = method2086();
		boolean var3 = field631 && field633 > 2;
		if (!var3) {
			boolean var4;
			if (var2 < 0) {
				var4 = false;
			} else {
				int var5 = field636[var2];
				if (var5 >= 2000) {
					var5 -= 2000;
				}

				if (var5 == 1007) {
					var4 = true;
				} else {
					var4 = false;
				}
			}

			var3 = var4;
		}

		return var3 && !field641[var2];
	}

	final void method1511(int var1, int var2) {
		method7976(var1, var2);
		var1 -= field555;
		var2 -= field768;
		field180.method4405(field231, var1, var2, false);
		field669 = true;
	}

	final void method1252(boolean var1) {
		method4019(field656, class35.field211, class35.field3026, var1);
	}

	void method1349(class317 var1) {
		class317 var3 = -1 == var1.field3589 ? null : class166.method3349(var1.field3589);
		int var4;
		int var5;
		if (null == var3) {
			var4 = class35.field211;
			var5 = class35.field3026;
		} else {
			var4 = var3.field3572;
			var5 = var3.field3586;
		}

		class159.method3299(var1, var4, var5, false);
		class193.method3701(var1, var4, var5);
	}

	final void method1254() {
		method3176(field511);
		++field1289;
		if (field756 && field673) {
			int var2 = class36.field242;
			int var3 = class36.field243;
			var2 -= field670;
			var3 -= field671;
			if (var2 < field628) {
				var2 = field628;
			}

			if (var2 + field511.field3572 > field539.field3572 + field628) {
				var2 = field628 + field539.field3572 - field511.field3572;
			}

			if (var3 < field675) {
				var3 = field675;
			}

			if (var3 + field511.field3586 > field675 + field539.field3586) {
				var3 = field675 + field539.field3586 - field511.field3586;
			}

			int var4 = var2 - field677;
			int var5 = var3 - field678;
			int var6 = field511.field3653;
			if (field1289 > field511.field3639 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
				field724 = true;
			}

			int var7 = var2 - field628 + field539.field3591;
			int var8 = field539.field3592 + (var3 - field675);
			class84 var9;
			if (null != field511.field3666 && field724) {
				var9 = new class84();
				var9.field1048 = field511;
				var9.field1043 = var7;
				var9.field1044 = var8;
				var9.field1052 = field511.field3666;
				class67.method2351(var9);
			}

			if (0 == class36.field232) {
				if (field724) {
					if (null != field511.field3667) {
						var9 = new class84();
						var9.field1048 = field511;
						var9.field1043 = var7;
						var9.field1044 = var8;
						var9.field1046 = field672;
						var9.field1052 = field511.field3667;
						class67.method2351(var9);
					}

					if (null != field672) {
						class317 var10 = field511;
						int var11 = class318.method3810(class26.method353(var10));
						class317 var13;
						if (var11 == 0) {
							var13 = null;
						} else {
							int var12 = 0;

							while (true) {
								if (var12 >= var11) {
									var13 = var10;
									break;
								}

								var10 = class166.method3349(var10.field3589);
								if (var10 == null) {
									var13 = null;
									break;
								}

								++var12;
							}
						}

						if (null != var13) {
							class289 var14 = class331.method6337(class287.field3150, field753.field1385);
							var14.field3212.method8698(field672.field3703);
							var14.field3212.method8709(field672.field3570);
							var14.field3212.method8698(field672.field3571);
							var14.field3212.method8698(field511.field3571);
							var14.field3212.method8711(field511.field3570);
							var14.field3212.method8642(field511.field3703);
							field753.method2735(var14);
						}
					}
				} else if (this.method1250()) {
					this.method1511(field677 + field670, field671 + field678);
				} else if (field633 > 0) {
					method4047(field677 + field670, field678 + field671);
				}

				field511 = null;
			}

		} else {
			if (field1289 > 1) {
				if (!field724 && field633 > 0) {
					method4047(field677 + field670, field678 + field671);
				}

				field511 = null;
			}

		}
	}

	public class513 method7486() {
		return null != field3454 ? field3454.field1089 : null;
	}

	static class459 method2302() {
		return field1542;
	}

	static void method2857(class342 var0, String var1) {
		class80 var3 = new class80(var0, var1);
		field784.add(var3);
		field530 += var3.field1018;
	}

	static int method711() {
		if (null != field784 && field785 < field784.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= field785; ++var2) {
				var1 += ((class80)field784.get(var2)).field1019;
			}

			return var1 * 10000 / field530;
		} else {
			return 10000;
		}
	}

	static int method4848(int var0) {
		return var0 * 3 + 600;
	}

	static class342 method4859(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		class418 var6 = null;
		if (null != class170.field1836) {
			var6 = new class418(var0, class170.field1836, field4375[var0], 1000000);
		}

		return new class342(var6, field3036, var0, var1, var2, var3, var4);
	}

	static final void method480() {
		field753.method2737();
		class203.field2271.method5467();
		class195.method5528();
		class185.method20();
		class201.method189();
		class191.method3459();
		class202.method7135();
		class204.field2287.method5467();
		class204.field2302.method5467();
		class204.field2295.method5467();
		class194.field2082.method5467();
		class194.field2076.method5467();
		class197.field2105.method5467();
		class182.field1911.method5467();
		field1781.method8472();
		field882.method8472();
		class200.method7994();
		class186.method6613();
		class199.method2196();
		class198.method3343();
		class183.method6358();
		class482.method7284();
		class484.field4968.method5467();
		field779.method5467();
		field780.method5467();
		class314.method6567();
		class317.method289();
		((class229)class219.field2515.field2795).method4581();
		class75.field972.method5467();
		field742.method7458();
		field118.method6465();
		field3804.method6465();
		field1069.method6465();
		field4688.method6465();
		field4271.method6465();
		field4548.method6465();
		field2098.method6465();
		field4788.method6465();
		field2869.method6465();
		field4217.method6465();
		field2102.method6465();
		class75.field1541.method6465();
		field317.method6465();
		field180.method4466();

		for (int var1 = 0; var1 < 4; ++var1) {
			field561[var1].method4115();
		}

		field723.method4051();
		System.gc();
		class298.field3389 = 1;
		field3388 = null;
		field4411 = -1;
		field1913 = -1;
		field1324 = 0;
		field1459 = false;
		field1789 = 2;
		field650 = -1;
		field739 = false;
		class66.method3796();
		class139.method3145(10);
	}

	static final void method5526(int var0) {
		method480();
		switch(var0) {
		case 1:
			class72.method4360();
			break;
		case 2:
			class72.method2804();
		}

	}

	static long method2055() {
		return field614;
	}

	static final void method6595() {
		if (field761 > 0) {
			method480();
		} else {
			field516.method7352();
			class139.method3145(40);
			field3825 = field753.method2740();
			field753.method2738();
		}
	}

	static final void method181(boolean var0) {
		if (var0) {
			field527 = class72.field915 ? class136.field1616 : class136.field1618;
		} else {
			field527 = field112.method2400(class72.field930) ? class136.field1619 : class136.field1622;
		}

	}

	static final void method6316() {
		if (field1997 != null) {
			field1997.method828();
		}

		if (null != field163) {
			field163.method828();
		}

	}

	static void method5500(class204 var0, int var1, int var2, int var3) {
		if (field507 < 50 && field112.method2409() != 0) {
			if (null != var0.field2303 && var1 < var0.field2303.length) {
				method3329(var0.field2303[var1], var2, var3);
			}
		}
	}

	static void method387(class204 var0, int var1, int var2, int var3) {
		if (field507 < 50 && field112.method2409() != 0) {
			if (var0.field2312 != null && var0.field2312.containsKey(var1)) {
				method3329((Integer)var0.field2312.get(var1), var2, var3);
			}
		}
	}

	static void method3329(int var0, int var1, int var2) {
		if (var0 != 0) {
			int var4 = var0 >> 8;
			int var5 = var0 >> 4 & 7;
			int var6 = var0 & 15;
			field741[field507] = var4;
			field603[field507] = var5;
			field556[field507] = 0;
			field745[field507] = null;
			int var7 = (var1 - 64) / 128;
			int var8 = (var2 - 64) / 128;
			field744[field507] = var6 + (var7 << 16) + (var8 << 8);
			++field507;
		}
	}

	static void method3071(int var0, int var1, int var2) {
		if (field112.method2407() != 0 && var1 != 0 && field507 < 50) {
			field741[field507] = var0;
			field603[field507] = var1;
			field556[field507] = var2;
			field745[field507] = null;
			field744[field507] = 0;
			++field507;
		}

	}

	static final void method5782() {
		if (field865) {
			if (class67.field1426 != null) {
				class67.field1426.method7621();
			}

			for (int var1 = 0; var1 < class103.field1335; ++var1) {
				class88 var2 = field611[class103.field1341[var1]];
				var2.method2237();
			}

			field865 = false;
		}

	}

	static final void method3532() {
		if (field1025) {
			for (int var1 = 0; var1 < class103.field1335; ++var1) {
				class88 var2 = field611[class103.field1341[var1]];
				var2.method2240();
			}

			field1025 = false;
		}

	}

	static final void method5753(class317 var0, int var1, int var2) {
		if (field653 == 0 || field653 == 3) {
			if (!field669 && (class36.field252 == 1 || !field4941 && class36.field252 == 4)) {
				class306 var4 = var0.method6132(true, (byte)29);
				if (null == var4) {
					return;
				}

				int var5 = class36.field250 - var1;
				int var6 = class36.field251 - var2;
				if (var4.method5755(var5, var6)) {
					var5 -= var4.field3477 / 2;
					var6 -= var4.field3472 / 2;
					int var7 = field758 & 2047;
					int var8 = class219.field2512[var7];
					int var9 = class219.field2516[var7];
					int var10 = var5 * var9 + var6 * var8 >> 11;
					int var11 = var6 * var9 - var5 * var8 >> 11;
					int var12 = field3454.field1171 + var10 >> 7;
					int var13 = field3454.field1138 - var11 >> 7;
					class289 var14 = class331.method6337(class287.field3106, field753.field1385);
					var14.field3212.method8695(18);
					var14.field3212.method8859(field2841 + var13);
					var14.field3212.method8734(var12 + field2850);
					var14.field3212.method8805(field722.method4076(82) ? (field722.method4076(81) ? 2 : 1) : 0);
					var14.field3212.method8695(var5);
					var14.field3212.method8695(var6);
					var14.field3212.method8642(field758);
					var14.field3212.method8695(57);
					var14.field3212.method8695(0);
					var14.field3212.method8695(0);
					var14.field3212.method8695(89);
					var14.field3212.method8642(field3454.field1171);
					var14.field3212.method8642(field3454.field1138);
					var14.field3212.method8695(63);
					field753.method2735(var14);
					field735 = var12;
					field487 = var13;
				}
			}

		}
	}

	static final int method7926(int var0) {
		return Math.abs(var0 - field1531) > 1024 ? (var0 < field1531 ? 1 : -1) * 2048 + var0 : var0;
	}

	static final void method13() {
		class134.method3102(field3007, field1345, field1958);
		class68.method1970(field1042, field1083);
		if (field257 == field3007 && field1867 == field1345 && field3391 == field1958 && field1042 == field2975 && field1531 == field1083) {
			field732 = false;
			field746 = false;
			field674 = false;
			field748 = false;
			field4885 = 0;
			field1872 = 0;
			field470 = 0;
			field4214 = 0;
			field1938 = 0;
			field1638 = 0;
			field138 = 0;
			field1903 = 0;
			field1500 = 0;
			field91 = 0;
			field668 = null;
			field738 = null;
			field751 = null;
		}

	}

	static final void method4090() {
		int var1 = class103.field1335;
		int[] var2 = class103.field1341;

		for (int var3 = 0; var3 < var1; ++var3) {
			class88 var4 = field611[var2[var3]];
			if (var4 != null) {
				class38.method727(var4, 1);
			}
		}

	}

	static final void method3614() {
		for (int var1 = 0; var1 < field737; ++var1) {
			int var2 = field548[var1];
			class96 var3 = field546[var2];
			if (null != var3) {
				class38.method727(var3, var3.field1277.field2042);
			}
		}

	}

	static void method723() {
		if (null != field1542) {
			field1542.method8297(field231, (field3454.field1171 >> 7) + field2850, field2841 + (field3454.field1138 >> 7), false);
			field1542.method8237();
		}

	}

	static int method6581() {
		return field715 ? 2 : 1;
	}

	static void method12() {
		class289 var1 = class331.method6337(class287.field3115, field753.field1385);
		var1.field3212.method8695(method6581());
		var1.field3212.method8642(class35.field211);
		var1.field3212.method8642(class35.field3026);
		field753.method2735(var1);
	}

	static void method2617() {
		if (field615) {
			class36.method712(field3454, false);
		}

	}

	static final void method6287(int var0, int var1) {
		if (2 == field508) {
			class375.method6952(field766 + (field654 - field2850 << 7), field705 + (field512 - field2841 << 7), field547 * 2);
			if (field708 > -1 && field602 % 20 < 10) {
				field1959[0].method9106(var0 + field708 - 12, field572 + var1 - 28);
			}

		}
	}

	public static class363 method6594() {
		return field699;
	}

	static void method5149() {
		for (class207 var1 = (class207)field702.method6716(); null != var1; var1 = (class207)field702.method6725()) {
			var1.method8051();
		}

	}

	static final void method2909(class91 var0, int var1) {
		class375.method6952(var0.field1171, var0.field1138, var1);
	}

	static void method3168(class96 var0) {
		var0.field1141 = var0.field1277.field2042;
		var0.field1191 = var0.field1277.field2016;
		var0.field1146 = var0.field1277.field2020;
		var0.field1147 = var0.field1277.field2021;
		var0.field1148 = var0.field1277.field2022;
		var0.field1155 = var0.field1277.field2023;
		var0.field1139 = var0.field1277.field2050;
		var0.field1137 = var0.field1277.field2018;
		var0.field1167 = var0.field1277.field2019;
		var0.field1150 = var0.field1277.field2049;
		var0.field1151 = var0.field1277.field2009;
		var0.field1152 = var0.field1277.field2026;
		var0.field1153 = var0.field1277.field2038;
		var0.field1154 = var0.field1277.field2024;
		var0.field1197 = var0.field1277.field2029;
		var0.field1156 = var0.field1277.field2030;
		var0.field1158 = var0.field1277.field2031;
	}

	static void method3297() {
		field633 = 0;
		field669 = false;
		field639[0] = class337.field4095;
		field581[0] = "";
		field636[0] = 1006;
		field641[0] = false;
		field633 = 1;
	}

	static final boolean method7334() {
		return field669;
	}

	static void method7976(int var0, int var1) {
		int var3 = field1635.method7145(class337.field4114);

		int var4;
		int var5;
		for (var4 = 0; var4 < field633; ++var4) {
			var5 = field1635.method7145(class405.method7550(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = field633 * 15 + 22;
		var5 = var0 - var3 / 2;
		if (var3 + var5 > class35.field211) {
			var5 = class35.field211 - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var1;
		if (var4 + var1 > class35.field3026) {
			var6 = class35.field3026 - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		field2065 = var5;
		field1020 = var6;
		field4753 = var3;
		field1693 = field633 * 15 + 22;
	}

	static final void method3142(class70 var0, int var1, int var2) {
		if (var0 != null) {
			class18.method250(var0.field877, var0.field880, var0.field878, var0.field879, var0.field876, var0.field881, var0.field883, var1, var2);
		}

	}

	static void method2846(int var0, String var1) {
		int var3 = class103.field1335;
		int[] var4 = class103.field1341;
		boolean var5 = false;
		class513 var6 = new class513(var1, field889);

		for (int var7 = 0; var7 < var3; ++var7) {
			class88 var8 = field611[var4[var7]];
			if (null != var8 && var8 != field3454 && null != var8.field1089 && var8.field1089.equals(var6)) {
				class289 var9;
				if (var0 == 1) {
					var9 = class331.method6337(class287.field3128, field753.field1385);
					var9.field3212.method8805(0);
					var9.field3212.method8642(var4[var7]);
					field753.method2735(var9);
				} else if (var0 == 4) {
					var9 = class331.method6337(class287.field3161, field753.field1385);
					var9.field3212.method8716(0);
					var9.field3212.method8734(var4[var7]);
					field753.method2735(var9);
				} else if (var0 == 6) {
					var9 = class331.method6337(class287.field3156, field753.field1385);
					var9.field3212.method8698(var4[var7]);
					var9.field3212.method8716(0);
					field753.method2735(var9);
				} else if (var0 == 7) {
					var9 = class331.method6337(class287.field3117, field753.field1385);
					var9.field3212.method8859(var4[var7]);
					var9.field3212.method8688(0);
					field753.method2735(var9);
				}

				var5 = true;
				break;
			}
		}

		if (!var5) {
			class106.method2852(4, "", class337.field4045 + var1);
		}

	}

	static void method287(int var0, int var1, int var2, int var3) {
		class317 var5 = class317.method881(var0, var1);
		if (var5 != null && var5.field3625 != null) {
			class84 var6 = new class84();
			var6.field1048 = var5;
			var6.field1052 = var5.field3625;
			class67.method2351(var6);
		}

		field600 = var3;
		field651 = true;
		field2805 = var0;
		field658 = var1;
		field958 = var2;
		method3176(var5);
	}

	static void method3392() {
		if (field651) {
			class317 var1 = class317.method881(field2805, field658);
			if (var1 != null && null != var1.field3669) {
				class84 var2 = new class84();
				var2.field1048 = var1;
				var2.field1052 = var1.field3669;
				class67.method2351(var2);
			}

			field600 = -1;
			field651 = false;
			method3176(var1);
		}
	}

	static void method2190(int var0, int var1) {
		class289 var3 = class331.method6337(class287.field3174, field753.field1385);
		var3.field3212.method8711(var0);
		var3.field3212.method8734(var1);
		field753.method2735(var3);
	}

	static final void method7928() {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < field633 - 1; ++var2) {
				if (field636[var2] < 1000 && field636[var2 + 1] > 1000) {
					String var3 = field581[var2];
					field581[var2] = field581[var2 + 1];
					field581[var2 + 1] = var3;
					String var4 = field639[var2];
					field639[var2] = field639[var2 + 1];
					field639[var2 + 1] = var4;
					int var5 = field636[var2];
					field636[var2] = field636[var2 + 1];
					field636[var2 + 1] = var5;
					var5 = field634[var2];
					field634[var2] = field634[var2 + 1];
					field634[var2 + 1] = var5;
					var5 = field635[var2];
					field635[var2] = field635[var2 + 1];
					field635[var2 + 1] = var5;
					var5 = field637[var2];
					field637[var2] = field637[var2 + 1];
					field637[var2 + 1] = var5;
					var5 = field638[var2];
					field638[var2] = field638[var2 + 1];
					field638[var2 + 1] = var5;
					boolean var6 = field641[var2];
					field641[var2] = field641[var2 + 1];
					field641[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

	}

	public static final void method1986(String var0, String var1, int var2, int var3, int var4, int var5) {
		method4754(var0, var1, var2, var3, var4, var5, -1, false);
	}

	static final void method3141(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		method4754(var0, var1, var2, var3, var4, var5, var6, false);
	}

	static final void method4754(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!field669) {
			if (field633 < 500) {
				field639[field633] = var0;
				field581[field633] = var1;
				field636[field633] = var2;
				field637[field633] = var3;
				field634[field633] = var4;
				field635[field633] = var5;
				field638[field633] = var6;
				field641[field633] = var7;
				++field633;
			}

		}
	}

	static final int method2086() {
		return field633 - 1;
	}

	static final void method4019(int var0, int var1, int var2, boolean var3) {
		if (class45.method882(var0)) {
			class136.method3120(field2057[var0], -1, var1, var2, var3);
		}
	}

	static final void method2656(int var0, int var1, int var2, int var3, int var4) {
		field1265[0].method9072(var0, var1);
		field1265[1].method9072(var0, var3 + var1 - 16);
		class499.method9012(var0, var1 + 16, 16, var3 - 32, field576);
		int var6 = (var3 - 32) * var3 / var4;
		if (var6 < 8) {
			var6 = 8;
		}

		int var7 = var2 * (var3 - 32 - var6) / (var4 - var3);
		class499.method9012(var0, var1 + 16 + var7, 16, var6, field584);
		class499.method9034(var0, var1 + 16 + var7, var6, field569);
		class499.method9034(var0 + 1, var7 + var1 + 16, var6, field569);
		class499.method8995(var0, var7 + var1 + 16, 16, field569);
		class499.method8995(var0, var1 + 17 + var7, 16, field569);
		class499.method9034(var0 + 15, var1 + 16 + var7, var6, field568);
		class499.method9034(var0 + 14, var1 + 17 + var7, var6 - 1, field568);
		class499.method8995(var0, var6 + var1 + 15 + var7, 16, field568);
		class499.method8995(var0 + 1, var1 + 14 + var7 + var6, 15, field568);
	}

	static void method2913(boolean var0) {
		field643 = var0;
	}

	static boolean method178() {
		return field643;
	}

	static final void method726(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class45.method882(var0)) {
			class233.method4749(field2057[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}

	static boolean method2193(int var0) {
		for (int var2 = 0; var2 < field488; ++var2) {
			if (field557[var2] == var0) {
				return true;
			}
		}

		return false;
	}

	static void method5493(int var0) {
		field4318 = new class70();
		field4318.field877 = field634[var0];
		field4318.field880 = field635[var0];
		field4318.field878 = field636[var0];
		field4318.field879 = field637[var0];
		field4318.field876 = field638[var0];
		field4318.field881 = field639[var0];
		field4318.field883 = field581[var0];
	}

	static void method4047(int var0, int var1) {
		method3142(field4318, var0, var1);
		field4318 = null;
	}

	public static void method3176(class317 var0) {
		if (var0 != null && field660 == var0.field3698) {
			field706[var0.field3714] = true;
		}

	}

	static void method5492() {
		for (class83 var1 = (class83)field657.method8387(); null != var1; var1 = (class83)field657.method8384()) {
			int var2 = var1.field1037;
			if (class45.method882(var2)) {
				boolean var3 = true;
				class317[] var4 = field2057[var2];

				int var5;
				for (var5 = 0; var5 < var4.length; ++var5) {
					if (var4[var5] != null) {
						var3 = var4[var5].field3651;
						break;
					}
				}

				if (!var3) {
					var5 = (int)var1.field4745;
					class317 var6 = class166.method3349(var5);
					if (var6 != null) {
						method3176(var6);
					}
				}
			}
		}

	}

	static final void method5499(int var0) {
		if (class45.method882(var0)) {
			class317[] var2 = field2057[var0];

			for (int var3 = 0; var3 < var2.length; ++var3) {
				class317 var4 = var2[var3];
				if (var4 != null) {
					var4.field3705 = 0;
					var4.field3706 = 0;
				}
			}

		}
	}

	static final void method1206(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var2 = 0.5F + (float)var0 / 200.0F;
		method1165((double)var2);
	}

	static final int method2655() {
		float var1 = 200.0F * ((float)field112.method2403() - 0.5F);
		return 100 - Math.round(var1);
	}

	static final void method1165(double var0) {
		class219.method286(var0);
		((class229)class219.field2515.field2795).method4563(var0);
		class202.method3055();
		field112.method2402(var0);
	}

	static final void method3062(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		field112.method2406(var0);
	}

	static final void method3119(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		field112.method2408(var0);
	}

	static final void method3203() {
		class289 var1 = class331.method6337(class287.field3167, field753.field1385);
		field753.method2735(var1);
		class67.field854 = true;

		for (class83 var2 = (class83)field657.method8387(); var2 != null; var2 = (class83)field657.method8384()) {
			if (0 == var2.field1038 || var2.field1038 == 3) {
				class358.method6676(var2, true);
			}
		}

		if (field661 != null) {
			method3176(field661);
			field661 = null;
		}

		class67.field854 = false;
	}

	static final class83 method2601(int var0, int var1, int var2) {
		class83 var4 = new class83();
		var4.field1037 = var1;
		var4.field1038 = var2;
		field657.method8382(var4, (long)var0);
		method5499(var1);
		class317 var5 = class166.method3349(var0);
		method3176(var5);
		if (field661 != null) {
			method3176(field661);
			field661 = null;
		}

		class242.method4836(field2057[var0 >> 16], var5, false);
		class67.method164(var1);
		if (-1 != field656) {
			class128.method3048(field656, 1);
		}

		return var4;
	}

	static final void method8596(int var0, int var1, int var2, int var3, class503 var4, class306 var5) {
		int var7 = var3 * var3 + var2 * var2;
		if (var7 > 4225 && var7 < 90000) {
			int var8 = field758 & 2047;
			int var9 = class219.field2512[var8];
			int var10 = class219.field2516[var8];
			int var11 = var2 * var10 + var9 * var3 >> 16;
			int var12 = var10 * var3 - var9 * var2 >> 16;
			double var13 = Math.atan2((double)var11, (double)var12);
			int var15 = var5.field3477 / 2 - 25;
			int var16 = (int)(Math.sin(var13) * (double)var15);
			int var17 = (int)(Math.cos(var13) * (double)var15);
			byte var18 = 20;
			field1233.method9122(var5.field3477 / 2 + var0 - var18 / 2 + var16, var1 + var5.field3472 / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
		} else {
			class427.method7947(var0, var1, var2, var3, var4, var5);
		}

	}

	static final void method2045() {
		class106.method2995();
		if (null != class67.field1426) {
			class67.field1426.method7515();
		}

	}

	static final void method724() {
		field692 = field680;
		field1025 = true;
	}

	static final void method8519(String var0) {
		if (class67.field1426 != null) {
			class289 var2 = class331.method6337(class287.field3185, field753.field1385);
			var2.field3212.method8695(class489.method2092(var0));
			var2.field3212.method8648(var0);
			field753.method2735(var2);
		}
	}

	static final void method7136(String var0) {
		if (!var0.equals("")) {
			class289 var2 = class331.method6337(class287.field3143, field753.field1385);
			var2.field3212.method8695(class489.method2092(var0));
			var2.field3212.method8648(var0);
			field753.method2735(var2);
		}
	}

	static final void method4849() {
		class289 var1 = class331.method6337(class287.field3143, field753.field1385);
		var1.field3212.method8695(0);
		field753.method2735(var1);
	}

	static final void method3497(int var0, int var1, boolean var2) {
		if (field679[var0] != null) {
			if (var1 >= 0 && var1 < field679[var0].method3303()) {
				class142 var4 = (class142)field679[var0].field1770.get(var1);
				class289 var5 = class331.method6337(class287.field3178, field753.field1385);
				var5.field3212.method8695(4 + class489.method2092(var4.field1652.method9256()));
				var5.field3212.method8695(var0);
				var5.field3212.method8642(var1);
				var5.field3212.method8647(var2);
				var5.field3212.method8648(var4.field1652.method9256());
				field753.method2735(var5);
			}
		}
	}

	static boolean method7362(class317 var0) {
		return var0.field3590;
	}

	static String method5750(class317 var0) {
		if (class318.method3742(class26.method353(var0)) == 0) {
			return null;
		} else {
			return var0.field3713 != null && var0.field3713.trim().length() != 0 ? var0.field3713 : null;
		}
	}

	static void method2805(class489 var0, int var1) {
		byte[] var3 = var0.field4991;
		if (null == field536) {
			field536 = new byte[24];
		}

		class385.method7298(var3, var1, field536, 0, 24);
		class170.method3501(var0, var1);
	}

	static void method4851(int var0) {
		field505 = var0;
	}

	static void method333() {
		field753.method2735(class331.method6337(class287.field3102, field753.field1385));
		field505 = 0;
	}

	static void method3456() {
		if (field505 == 1) {
			field586 = true;
		}

	}

	static void method6321() {
		if (field586 && field3454 != null) {
			int var1 = field3454.field1174[0];
			int var2 = field3454.field1176[0];
			if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
				return;
			}

			field194 = field3454.field1171;
			int var3 = class148.method3196(field3454.field1171, field3454.field1138, field231) - field771;
			if (var3 < field1297) {
				field1297 = var3;
			}

			field1675 = field3454.field1138;
			field586 = false;
		}

	}

	static void method2220() {
		if (class459.field1586 != null) {
			field782 = field602;
			class459.field1586.method6659();

			for (int var1 = 0; var1 < field611.length; ++var1) {
				if (field611[var1] != null) {
					class459.field1586.method6654(field2850 + (field611[var1].field1171 >> 7), (field611[var1].field1138 >> 7) + field2841);
				}
			}
		}

	}

	static boolean method3115() {
		return field112.method2413() >= field494;
	}

	static void method5491(int var0) {
		if (field765 != var0) {
			field765 = var0;
		}
	}

	static class483 method4063(int var0) {
		class483 var2 = (class483)field779.method5461((long)var0);
		if (var2 == null) {
			var2 = new class483(field317, class485.method6945(var0), class485.method7769(var0));
			field779.method5463(var2, (long)var0);
		}

		return var2;
	}

	static class483 method100(int var0) {
		class483 var2 = (class483)field780.method5461((long)var0);
		if (null == var2) {
			var2 = new class483(field317, var0);
		}

		return var2;
	}

	public static Clipboard method3170() {
		return field466.method521();
	}

	static void method324(int var0) {
		class204 var2 = class81.method2189(var0, (byte)13);
		if (var2.method4004()) {
			if (class21.method305(var2.field2296) == 2) {
				field783.add(var2.field2296);
			}

		}
	}
}
