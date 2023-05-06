import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class315 {
	boolean field3531;
	boolean field3532;
	boolean field3534;
	class309 field3548;
	class309 field3549;
	class380 field3536;
	class380 field3537;
	int field3524;
	int field3525;
	int field3529;
	int field3533;
	int field3535;
	int field3538;
	int field3539;
	int field3540;
	int field3541;
	int field3542;
	int field3543;
	int field3545;
	int field3546;
	int field3547;

	class315() {
		this.field3537 = new class380();
		this.field3536 = new class380();
		this.field3531 = false;
		this.field3532 = true;
		this.field3533 = 0;
		this.field3534 = false;
		this.field3535 = 0;
		this.field3547 = 0;
		this.field3529 = 0;
		this.field3538 = 0;
		this.field3539 = 0;
		this.field3540 = 0;
		this.field3541 = 0;
		this.field3542 = Integer.MAX_VALUE;
		this.field3543 = Integer.MAX_VALUE;
		this.field3524 = 0;
		this.field3545 = 0;
		this.field3546 = 0;
		this.field3525 = 0;
		this.field3537.method7012(1);
		this.field3536.method7012(1);
	}

	void method6043() {
		this.field3533 = (this.field3533 + 1) % 60;
		if (this.field3541 > 0) {
			--this.field3541;
		}

	}

	public boolean method5847(boolean var1) {
		var1 = var1 && this.field3532;
		boolean var3 = var1 != this.field3531;
		this.field3531 = var1;
		if (!this.field3531) {
			this.method5871(this.field3538, this.field3538);
		}

		return var3;
	}

	public void method5848(boolean var1) {
		this.field3532 = var1;
		this.field3531 = var1 && this.field3531;
	}

	boolean method5849(String var1) {
		String var3 = this.field3537.method7007();
		if (!var3.equals(var1)) {
			var1 = this.method5915(var1);
			this.field3537.method7019(var1);
			this.method5856(this.field3546, this.field3525);
			this.method5919();
			this.method5924();
			return true;
		} else {
			return false;
		}
	}

	boolean method5850(String var1) {
		this.field3536.method7019(var1);
		return true;
	}

	boolean method5889(class383 var1) {
		boolean var3 = !this.field3534;
		this.field3537.method7115(var1);
		this.field3536.method7115(var1);
		this.field3534 = true;
		var3 |= this.method5856(this.field3546, this.field3525);
		var3 |= this.method5871(this.field3539, this.field3538);
		if (this.method5919()) {
			this.method5924();
			var3 = true;
		}

		return var3;
	}

	public boolean method5852(int var1, int var2) {
		boolean var4 = this.field3524 != var1 || var2 != this.field3545;
		this.field3524 = var1;
		this.field3545 = var2;
		var4 |= this.method5856(this.field3546, this.field3525);
		return var4;
	}

	public boolean method5853(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var3 = var1 == this.field3537.method7121();
		this.field3537.method7062(var1);
		this.field3536.method7062(var1);
		if (this.method5919()) {
			this.method5924();
			var3 = true;
		}

		return var3;
	}

	public boolean method6096(int var1) {
		this.field3537.method7003(var1);
		if (this.method5919()) {
			this.method5924();
			return true;
		} else {
			return false;
		}
	}

	public boolean method5855(int var1) {
		this.field3543 = var1;
		if (this.method5919()) {
			this.method5924();
			return true;
		} else {
			return false;
		}
	}

	public boolean method5856(int var1, int var2) {
		if (!this.method5903()) {
			this.field3546 = var1;
			this.field3525 = var2;
			return false;
		} else {
			int var4 = this.field3546;
			int var5 = this.field3525;
			int var6 = Math.max(0, this.field3537.method7025() - this.field3524 + 2);
			int var7 = Math.max(0, this.field3537.method7026() - this.field3545 + 1);
			this.field3546 = Math.max(0, Math.min(var6, var1));
			this.field3525 = Math.max(0, Math.min(var7, var2));
			return var4 != this.field3546 || this.field3525 != var5;
		}
	}

	public boolean method5857(int var1, int var2) {
		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}

		return var4 ? this.field3537.method7013(var1, var2) : false;
	}

	public void method5858(int var1) {
		this.field3537.method7014(var1);
	}

	public void method5846(int var1) {
		this.field3535 = var1;
	}

	public void method5860(int var1) {
		this.field3537.method7012(var1);
	}

	public void method5861(int var1) {
		this.field3537.method7040(var1);
	}

	public boolean method5862(int var1) {
		this.field3529 = var1;
		String var3 = this.field3537.method7007();
		int var4 = var3.length();
		var3 = this.method5915(var3);
		if (var3.length() != var4) {
			this.field3537.method7019(var3);
			this.method5856(this.field3546, this.field3525);
			this.method5919();
			this.method5924();
			return true;
		} else {
			return false;
		}
	}

	public void method5975() {
		this.field3534 = false;
	}

	public boolean method5864(int var1) {
		if (this.method5923(var1)) {
			this.method5869();
			class381 var3 = this.field3537.method7049((char)var1, this.field3538, this.field3542);
			this.method5871(var3.method7138(), var3.method7138());
			this.method5919();
			this.method5924();
		}

		return true;
	}

	public void method5967() {
		if (!this.method5869() && this.field3538 > 0) {
			int var2 = this.field3537.method7021(this.field3538 - 1);
			this.method5924();
			this.method5871(var2, var2);
		}

	}

	public void method5927() {
		if (!this.method5869() && this.field3538 < this.field3537.method7006()) {
			int var2 = this.field3537.method7021(this.field3538);
			this.method5924();
			this.method5871(var2, var2);
		}

	}

	public void method6050() {
		if (!this.method5869() && this.field3538 > 0) {
			class462 var2 = this.method5917(this.field3538 - 1);
			int var3 = this.field3537.method7022((Integer)var2.field4887, this.field3538);
			this.method5924();
			this.method5871(var3, var3);
		}

	}

	public void method6102() {
		if (!this.method5869() && this.field3538 < this.field3537.method7006()) {
			class462 var2 = this.method5917(this.field3538);
			int var3 = this.field3537.method7022(this.field3538, (Integer)var2.field4888);
			this.method5924();
			this.method5871(var3, var3);
		}

	}

	boolean method5869() {
		if (!this.method5914()) {
			return false;
		} else {
			int var2 = this.field3537.method7022(this.field3539, this.field3538);
			this.method5924();
			this.method5871(var2, var2);
			return true;
		}
	}

	public void method6112() {
		this.method5871(0, this.field3537.method7006());
	}

	public boolean method5871(int var1, int var2) {
		if (!this.method5903()) {
			this.field3539 = var1;
			this.field3538 = var2;
			return false;
		} else {
			if (var1 > this.field3537.method7006()) {
				var1 = this.field3537.method7006();
			}

			if (var2 > this.field3537.method7006()) {
				var2 = this.field3537.method7006();
			}

			boolean var4 = this.field3539 != var1 || this.field3538 != var2;
			this.field3539 = var1;
			if (var2 != this.field3538) {
				this.field3538 = var2;
				this.field3533 = 0;
				this.method5922();
			}

			if (var4 && this.field3549 != null) {
				this.field3549.method5787();
			}

			return var4;
		}
	}

	public void method5868(boolean var1) {
		class462 var3 = this.method5918(this.field3538);
		this.method5920((Integer)var3.field4887, var1, (byte)41);
	}

	public void method5977(boolean var1) {
		class462 var3 = this.method5918(this.field3538);
		this.method5920((Integer)var3.field4888, var1, (byte)31);
	}

	public void method5874(boolean var1) {
		this.method5920(0, var1, (byte)6);
	}

	public void method5982(boolean var1) {
		this.method5920(this.field3537.method7006(), var1, (byte)85);
	}

	public void method5876(boolean var1) {
		if (this.method5914() && !var1) {
			this.method5920(Math.min(this.field3539, this.field3538), var1, (byte)35);
		} else if (this.field3538 > 0) {
			this.method5920(this.field3538 - 1, var1, (byte)107);
		}

	}

	public void method5877(boolean var1) {
		if (this.method5914() && !var1) {
			this.method5920(Math.max(this.field3539, this.field3538), var1, (byte)121);
		} else if (this.field3538 < this.field3537.method7006()) {
			this.method5920(1 + this.field3538, var1, (byte)8);
		}

	}

	public void method6111(boolean var1) {
		if (this.field3538 > 0) {
			class462 var3 = this.method5917(this.field3538 - 1);
			this.method5920((Integer)var3.field4887, var1, (byte)53);
		}

	}

	public void method5879(boolean var1) {
		if (this.field3538 < this.field3537.method7006()) {
			class462 var3 = this.method5917(1 + this.field3538);
			this.method5920((Integer)var3.field4888, var1, (byte)119);
		}

	}

	public void method5880(boolean var1) {
		if (this.field3538 > 0) {
			this.method5920(this.field3537.method7024(this.field3538, -1), var1, (byte)12);
		}

	}

	public void method5881(boolean var1) {
		if (this.field3538 < this.field3537.method7006()) {
			this.method5920(this.field3537.method7024(this.field3538, 1), var1, (byte)12);
		}

	}

	public void method5882(boolean var1) {
		if (this.field3538 > 0) {
			int var3 = this.method5921();
			this.method5920(this.field3537.method7024(this.field3538, -var3), var1, (byte)70);
		}

	}

	public void method5867(boolean var1) {
		if (this.field3538 < this.field3537.method7006()) {
			int var3 = this.method5921();
			this.method5920(this.field3537.method7024(this.field3538, var3), var1, (byte)102);
		}

	}

	public void method5884(boolean var1) {
		class384 var3 = this.field3537.method7083(0, this.field3538);
		class462 var4 = var3.method7254();
		this.method5920(this.field3537.method7023((Integer)var4.field4887, this.field3525), var1, (byte)12);
	}

	public void method5870(boolean var1) {
		class384 var3 = this.field3537.method7083(0, this.field3538);
		class462 var4 = var3.method7254();
		this.method5920(this.field3537.method7023((Integer)var4.field4887, this.field3545 + this.field3525), var1, (byte)118);
	}

	public void method5886(int var1, int var2, boolean var3, boolean var4) {
		boolean var6 = false;
		class462 var7;
		int var9;
		if (!this.field3534) {
			var9 = 0;
		} else {
			var1 += this.field3546;
			var2 += this.field3525;
			var7 = this.method5926();
			var9 = this.field3537.method7023(var1 - (Integer)var7.field4887, var2 - (Integer)var7.field4888);
		}

		if (var3 && var4) {
			this.field3547 = 1;
			var7 = this.method5917(var9);
			class462 var8 = this.method5917(this.field3540);
			this.method5916(var8, var7);
		} else if (var3) {
			this.field3547 = 1;
			var7 = this.method5917(var9);
			this.method5871((Integer)var7.field4887, (Integer)var7.field4888);
			this.field3540 = (Integer)var7.field4887;
		} else if (var4) {
			this.method5871(this.field3540, var9);
		} else {
			if (this.field3541 > 0 && var9 == this.field3540) {
				if (this.field3539 == this.field3538) {
					this.field3547 = 1;
					var7 = this.method5917(var9);
					this.method5871((Integer)var7.field4887, (Integer)var7.field4888);
				} else {
					this.field3547 = 2;
					var7 = this.method5918(var9);
					this.method5871((Integer)var7.field4887, (Integer)var7.field4888);
				}
			} else {
				this.field3547 = 0;
				this.method5871(var9, var9);
				this.field3540 = var9;
			}

			this.field3541 = 25;
		}

	}

	public void method5875(int var1, int var2) {
		if (this.field3534 && this.method5898()) {
			var1 += this.field3546;
			var2 += this.field3525;
			class462 var4 = this.method5926();
			int var5 = this.field3537.method7023(var1 - (Integer)var4.field4887, var2 - (Integer)var4.field4888);
			class462 var6;
			class462 var7;
			switch(this.field3547) {
			case 0:
				this.method5871(this.field3539, var5);
				break;
			case 1:
				var6 = this.method5917(this.field3540);
				var7 = this.method5917(var5);
				this.method5916(var6, var7);
				break;
			case 2:
				var6 = this.method5918(this.field3540);
				var7 = this.method5918(var5);
				this.method5916(var6, var7);
			}
		}

	}

	public void method5888(Clipboard var1) {
		class384 var3 = this.field3537.method7083(this.field3539, this.field3538);
		if (!var3.method7255()) {
			String var4 = var3.method7264();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
			}
		}

	}

	public void method6033(Clipboard var1) {
		if (this.method5914()) {
			this.method5888(var1);
			this.method5869();
		}

	}

	public void method5890(Clipboard var1) {
		Transferable var3 = var1.getContents((Object)null);
		if (var3 != null && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = this.method5915((String)var3.getTransferData(DataFlavor.stringFlavor));
				this.method5869();
				class381 var5 = this.field3537.method7017(var4, this.field3538, this.field3542);
				this.method5871(var5.method7138(), var5.method7138());
				this.method5919();
				this.method5924();
			} catch (Exception var6) {
			}
		}

	}

	public void method6034() {
		this.field3525 = Math.max(0, this.field3525 - this.field3537.method7128());
	}

	public void method6038() {
		int var2 = Math.max(0, this.field3537.method7026() - this.field3545);
		this.field3525 = Math.min(var2, this.field3525 + this.field3537.method7128());
	}

	public void method5892(class309 var1) {
		this.field3548 = var1;
	}

	public void method6018(class309 var1) {
		this.field3549 = var1;
	}

	public class380 method5895() {
		return this.field3537;
	}

	public class380 method5896() {
		return this.field3536;
	}

	public class384 method5897() {
		return this.field3537.method7083(this.field3539, this.field3538);
	}

	public boolean method5898() {
		return this.field3531;
	}

	public boolean method5899() {
		return this.field3532;
	}

	public boolean method5900() {
		return this.method5898() && this.field3533 % 60 < 30;
	}

	public int method5901() {
		return this.field3538;
	}

	public int method5902() {
		return this.field3539;
	}

	public boolean method5903() {
		return this.field3534;
	}

	public int method5960() {
		return this.field3546;
	}

	public int method6059() {
		return this.field3525;
	}

	public int method5906() {
		return this.field3537.method7121();
	}

	public int method6089() {
		return this.field3537.method7031();
	}

	public int method5859() {
		return this.field3543;
	}

	public int method5909() {
		return this.field3535;
	}

	public int method5908() {
		return this.field3537.method7076();
	}

	public int method5911() {
		return this.field3529;
	}

	public int method5912() {
		return this.field3537.method7033();
	}

	public boolean method5913() {
		return this.method6089() > 1;
	}

	boolean method5914() {
		return this.field3539 != this.field3538;
	}

	String method5915(String var1) {
		StringBuilder var3 = new StringBuilder(var1.length());

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			char var5 = var1.charAt(var4);
			if (this.method5923(var5)) {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	void method5916(class462 var1, class462 var2) {
		if ((Integer)var2.field4887 < (Integer)var1.field4887) {
			this.method5871((Integer)var1.field4888, (Integer)var2.field4887);
		} else {
			this.method5871((Integer)var1.field4887, (Integer)var2.field4888);
		}

	}

	class462 method5917(int var1) {
		int var3 = this.field3537.method7006();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.method6088(this.field3537.method7002(var6 - 1).field4429)) {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.method6088(this.field3537.method7002(var6).field4429)) {
				var5 = var6;
				break;
			}
		}

		return new class462(var4, var5);
	}

	class462 method5918(int var1) {
		int var3 = this.field3537.method7006();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.field3537.method7002(var6 - 1).field4429 == '\n') {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.field3537.method7002(var6).field4429 == '\n') {
				var5 = var6;
				break;
			}
		}

		return new class462(var4, var5);
	}

	boolean method5919() {
		if (!this.method5903()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.field3537.method7006() > this.field3543) {
				this.field3537.method7022(this.field3543, this.field3537.method7006());
				var2 = true;
			}

			int var3 = this.method6089();
			int var4;
			if (this.field3537.method7028() > var3) {
				var4 = this.field3537.method7024(0, var3) - 1;
				this.field3537.method7022(var4, this.field3537.method7006());
				var2 = true;
			}

			if (var2) {
				var4 = this.field3538;
				int var5 = this.field3539;
				int var6 = this.field3537.method7006();
				if (this.field3538 > var6) {
					var4 = var6;
				}

				if (this.field3539 > var6) {
					var5 = var6;
				}

				this.method5871(var5, var4);
			}

			return var2;
		}
	}

	void method5920(int var1, boolean var2, byte var3) {
		if (var2) {
			if (var3 <= -1) {
				return;
			}

			this.method5871(this.field3539, var1);
		} else {
			this.method5871(var1, var1);
		}

	}

	int method5921() {
		return this.field3545 / this.field3537.method7128();
	}

	void method5922() {
		class384 var2 = this.field3537.method7083(0, this.field3538);
		class462 var3 = var2.method7254();
		int var4 = this.field3537.method7128();
		int var5 = (Integer)var3.field4887 - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.field4888 - 3;
		int var8 = var4 + var7 + 6;
		int var9 = this.field3546;
		int var10 = var9 + this.field3524;
		int var11 = this.field3525;
		int var12 = this.field3545 + var11;
		int var13 = this.field3546;
		int var14 = this.field3525;
		if (var5 < var9) {
			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.field3524;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.field3545;
		}

		this.method5856(var13, var14);
	}

	boolean method6088(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	void method5924() {
		if (this.field3548 != null) {
			this.field3548.method5787();
		}

	}

	boolean method5923(int var1) {
		switch(this.field3529) {
		case 1:
			return class70.method1983((char)var1);
		case 2:
			return class135.method3117((char)var1);
		case 3:
			return class150.method3204((char)var1);
		case 4:
			char var3 = (char)var1;
			if (class150.method3204(var3)) {
				return true;
			} else {
				if (var3 != 'k' && var3 != 'K' && var3 != 'm' && var3 != 'M' && var3 != 'b' && var3 != 'B') {
					return false;
				}

				return true;
			}
		default:
			return true;
		}
	}

	class462 method5926() {
		int var2 = this.field3537.method7123(this.field3524);
		int var3 = this.field3537.method7125(this.field3545);
		return new class462(var2, var3);
	}

	public static class289 method5985(int var0, String var1, class359 var2, int var3) {
		class289 var5 = class331.method6337(class287.field3111, Client.field753.field1385);
		var5.field3212.method8695(0);
		int var6 = var5.field3212.field4989;
		var5.field3212.method8695(var0);
		String var7 = var1.toLowerCase();
		byte var8 = 0;
		if (var7.startsWith(class337.field4026)) {
			var8 = 0;
			var1 = var1.substring(class337.field4026.length());
		} else if (var7.startsWith(class337.field4028)) {
			var8 = 1;
			var1 = var1.substring(class337.field4028.length());
		} else if (var7.startsWith(class337.field4030)) {
			var8 = 2;
			var1 = var1.substring(class337.field4030.length());
		} else if (var7.startsWith(class337.field3931)) {
			var8 = 3;
			var1 = var1.substring(class337.field3931.length());
		} else if (var7.startsWith(class337.field3866)) {
			var8 = 4;
			var1 = var1.substring(class337.field3866.length());
		} else if (var7.startsWith(class337.field4036)) {
			var8 = 5;
			var1 = var1.substring(class337.field4036.length());
		} else if (var7.startsWith(class337.field4038)) {
			var8 = 6;
			var1 = var1.substring(class337.field4038.length());
		} else if (var7.startsWith(class337.field4040)) {
			var8 = 7;
			var1 = var1.substring(class337.field4040.length());
		} else if (var7.startsWith(class337.field3940)) {
			var8 = 8;
			var1 = var1.substring(class337.field3940.length());
		} else if (var7.startsWith(class337.field4044)) {
			var8 = 9;
			var1 = var1.substring(class337.field4044.length());
		} else if (var7.startsWith(class337.field4046)) {
			var8 = 10;
			var1 = var1.substring(class337.field4046.length());
		} else if (var7.startsWith(class337.field3880)) {
			var8 = 11;
			var1 = var1.substring(class337.field3880.length());
		} else if (class359.field4317 != var2) {
			if (var7.startsWith(class337.field4027)) {
				var8 = 0;
				var1 = var1.substring(class337.field4027.length());
			} else if (var7.startsWith(class337.field4029)) {
				var8 = 1;
				var1 = var1.substring(class337.field4029.length());
			} else if (var7.startsWith(class337.field4031)) {
				var8 = 2;
				var1 = var1.substring(class337.field4031.length());
			} else if (var7.startsWith(class337.field3971)) {
				var8 = 3;
				var1 = var1.substring(class337.field3971.length());
			} else if (var7.startsWith(class337.field4035)) {
				var8 = 4;
				var1 = var1.substring(class337.field4035.length());
			} else if (var7.startsWith(class337.field3914)) {
				var8 = 5;
				var1 = var1.substring(class337.field3914.length());
			} else if (var7.startsWith(class337.field4039)) {
				var8 = 6;
				var1 = var1.substring(class337.field4039.length());
			} else if (var7.startsWith(class337.field4041)) {
				var8 = 7;
				var1 = var1.substring(class337.field4041.length());
			} else if (var7.startsWith(class337.field3892)) {
				var8 = 8;
				var1 = var1.substring(class337.field3892.length());
			} else if (var7.startsWith(class337.field3847)) {
				var8 = 9;
				var1 = var1.substring(class337.field3847.length());
			} else if (var7.startsWith(class337.field4048)) {
				var8 = 10;
				var1 = var1.substring(class337.field4048.length());
			} else if (var7.startsWith(class337.field4049)) {
				var8 = 11;
				var1 = var1.substring(class337.field4049.length());
			}
		}

		var7 = var1.toLowerCase();
		byte var9 = 0;
		if (var7.startsWith(class337.field4065)) {
			var9 = 1;
			var1 = var1.substring(class337.field4065.length());
		} else if (var7.startsWith(class337.field3966)) {
			var9 = 2;
			var1 = var1.substring(class337.field3966.length());
		} else if (var7.startsWith(class337.field4054)) {
			var9 = 3;
			var1 = var1.substring(class337.field4054.length());
		} else if (var7.startsWith(class337.field4056)) {
			var9 = 4;
			var1 = var1.substring(class337.field4056.length());
		} else if (var7.startsWith(class337.field4050)) {
			var9 = 5;
			var1 = var1.substring(class337.field4050.length());
		} else if (class359.field4317 != var2) {
			if (var7.startsWith(class337.field4015)) {
				var9 = 1;
				var1 = var1.substring(class337.field4015.length());
			} else if (var7.startsWith(class337.field3852)) {
				var9 = 2;
				var1 = var1.substring(class337.field3852.length());
			} else if (var7.startsWith(class337.field3844)) {
				var9 = 3;
				var1 = var1.substring(class337.field3844.length());
			} else if (var7.startsWith(class337.field4053)) {
				var9 = 4;
				var1 = var1.substring(class337.field4053.length());
			} else if (var7.startsWith(class337.field4051)) {
				var9 = 5;
				var1 = var1.substring(class337.field4051.length());
			}
		}

		var5.field3212.method8695(var8);
		var5.field3212.method8695(var9);
		class320.method4969(var5.field3212, var1);
		if (var0 == class325.field3744.method6674()) {
			var5.field3212.method8695(var3);
		}

		var5.field3212.method8655(var5.field3212.field4989 - var6);
		return var5;
	}
}
