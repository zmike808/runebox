public abstract class class91 extends class225 {
	public static class344 field1964;
	boolean field1140;
	boolean field1143;
	boolean field1145;
	boolean field1172;
	boolean field1177;
	byte field1164;
	byte field1181;
	byte field1200;
	byte field1201;
	byte field1209;
	class211[] field1199;
	class365 field1170;
	class464 field1186;
	int field1137;
	int field1138;
	int field1139;
	int field1141;
	int field1144;
	int field1146;
	int field1147;
	int field1148;
	int field1150;
	int field1151;
	int field1152;
	int field1153;
	int field1154;
	int field1155;
	int field1156;
	int field1157;
	int field1158;
	int field1159;
	int field1160;
	int field1161;
	int field1162;
	int field1167;
	int field1168;
	int field1169;
	int field1171;
	int field1173;
	int field1175;
	int field1178;
	int field1179;
	int field1180;
	int field1182;
	int field1183;
	int field1184;
	int field1185;
	int field1187;
	int field1188;
	int field1189;
	int field1190;
	int field1191;
	int field1192;
	int field1193;
	int field1194;
	int field1195;
	int field1196;
	int field1197;
	int field1198;
	int field1202;
	int field1203;
	int field1204;
	int field1206;
	int field1207;
	int field1208;
	int field1210;
	int field1211;
	int field1212;
	int[] field1142;
	int[] field1163;
	int[] field1165;
	int[] field1166;
	int[] field1174;
	int[] field1176;
	int[] field1205;
	String field1149;

	class91() {
		this.field1140 = false;
		this.field1141 = 1;
		this.field1139 = -1;
		this.field1137 = -1;
		this.field1167 = -1;
		this.field1146 = -1;
		this.field1147 = -1;
		this.field1148 = -1;
		this.field1155 = -1;
		this.field1150 = -1;
		this.field1151 = -1;
		this.field1152 = -1;
		this.field1153 = -1;
		this.field1154 = -1;
		this.field1197 = -1;
		this.field1156 = -1;
		this.field1158 = -1;
		this.field1149 = null;
		this.field1145 = false;
		this.field1161 = 100;
		this.field1162 = 0;
		this.field1207 = 0;
		this.field1164 = 0;
		this.field1165 = new int[4];
		this.field1166 = new int[4];
		this.field1205 = new int[4];
		this.field1163 = new int[4];
		this.field1142 = new int[4];
		this.field1170 = new class365();
		this.field1160 = -1;
		this.field1172 = false;
		this.field1173 = -1;
		this.field1198 = -1;
		this.field1175 = -1;
		this.field1187 = -1;
		this.field1178 = 0;
		this.field1179 = 0;
		this.field1180 = 0;
		this.field1202 = -1;
		this.field1182 = 0;
		this.field1183 = 0;
		this.field1184 = 0;
		this.field1185 = 0;
		this.field1186 = new class464(4);
		this.field1203 = 0;
		this.field1195 = 0;
		this.field1196 = 200;
		this.field1169 = -1;
		this.field1157 = -1;
		this.field1204 = 0;
		this.field1191 = 32;
		this.field1206 = 0;
		this.field1174 = new int[10];
		this.field1176 = new int[10];
		this.field1199 = new class211[10];
		this.field1210 = 0;
		this.field1211 = 0;
		this.field1212 = -1;
	}

	final void method2332() {
		this.field1206 = 0;
		this.field1211 = 0;
	}

	boolean method2315() {
		return false;
	}

	final void method2313(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = true;
		boolean var9 = true;

		int var10;
		for (var10 = 0; var10 < 4; ++var10) {
			if (this.field1205[var10] > var5) {
				var8 = false;
			} else {
				var9 = false;
			}
		}

		var10 = -1;
		int var11 = -1;
		int var12 = 0;
		if (var1 >= 0) {
			class200 var13 = class200.method2983(var1);
			var11 = var13.field2150;
			var12 = var13.field2143;
		}

		int var15;
		if (var9) {
			if (var11 == -1) {
				return;
			}

			var10 = 0;
			var15 = 0;
			if (var11 == 0) {
				var15 = this.field1205[0];
			} else if (var11 == 1) {
				var15 = this.field1166[0];
			}

			for (int var14 = 1; var14 < 4; ++var14) {
				if (var11 == 0) {
					if (this.field1205[var14] < var15) {
						var10 = var14;
						var15 = this.field1205[var14];
					}
				} else if (var11 == 1 && this.field1166[var14] < var15) {
					var10 = var14;
					var15 = this.field1166[var14];
				}
			}

			if (var11 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var8) {
				this.field1164 = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) {
				byte var16 = this.field1164;
				this.field1164 = (byte)((this.field1164 + 1) % 4);
				if (this.field1205[var16] <= var5) {
					var10 = var16;
					break;
				}
			}
		}

		if (var10 >= 0) {
			this.field1165[var10] = var1;
			this.field1166[var10] = var2;
			this.field1163[var10] = var3;
			this.field1142[var10] = var4;
			this.field1205[var10] = var5 + var12 + var6;
		}
	}

	final void method2322(int var1, int var2, int var3, int var4, int var5, int var6) {
		class186 var9 = (class186)class186.field1962.method5461((long)var1);
		class186 var8;
		if (null != var9) {
			var8 = var9;
		} else {
			byte[] var10 = field1964.method6468(33, var1);
			var9 = new class186();
			if (null != var10) {
				var9.method3580(new class489(var10));
			}

			class186.field1962.method5463(var9, (long)var1);
			var8 = var9;
		}

		var9 = var8;
		class95 var15 = null;
		class95 var11 = null;
		int var12 = var8.field1968;
		int var13 = 0;

		class95 var14;
		for (var14 = (class95)this.field1170.method6798(); var14 != null; var14 = (class95)this.field1170.method6767()) {
			++var13;
			if (var14.field1266.field1960 == var9.field1960) {
				var14.method2491(var4 + var2, var5, var6, var3);
				return;
			}

			if (var14.field1266.field1965 <= var9.field1965) {
				var15 = var14;
			}

			if (var14.field1266.field1968 > var12) {
				var11 = var14;
				var12 = var14.field1266.field1968;
			}
		}

		if (null != var11 || var13 < 4) {
			var14 = new class95(var9);
			if (var15 == null) {
				this.field1170.method6770(var14);
			} else {
				class365.method6756(var14, var15);
			}

			var14.method2491(var2 + var4, var5, var6, var3);
			if (var13 >= 4) {
				var11.method8051();
			}

		}
	}

	final void method2326(int var1) {
		class186 var4 = (class186)class186.field1962.method5461((long)var1);
		class186 var3;
		if (var4 != null) {
			var3 = var4;
		} else {
			byte[] var5 = field1964.method6468(33, var1);
			var4 = new class186();
			if (null != var5) {
				var4.method3580(new class489(var5));
			}

			class186.field1962.method5463(var4, (long)var1);
			var3 = var4;
		}

		var4 = var3;

		for (class95 var6 = (class95)this.field1170.method6798(); null != var6; var6 = (class95)this.field1170.method6767()) {
			if (var4 == var6.field1266) {
				var6.method8051();
				return;
			}
		}

	}

	void method2319(int var1, int var2, int var3, int var4) {
		int var6 = var4 + Client.field602;
		class512 var7 = (class512)this.field1186.method8360((long)var1);
		if (null != var7) {
			var7.method8051();
			--this.field1203;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var8 = 0;
			if (var4 > 0) {
				var8 = -1;
			}

			this.field1186.method8361(new class512(var2, var3, var6, var8), (long)var1);
			++this.field1203;
		}
	}

	class464 method2320() {
		return this.field1186;
	}

	void method2321() {
		class463 var2 = new class463(this.field1186);

		for (class512 var3 = (class512)var2.method8349(); null != var3; var3 = (class512)var2.next()) {
			var3.method8051();
		}

		this.field1203 = 0;
	}

	class232 method2318(class232 var1) {
		if (this.field1203 == 0) {
			return var1;
		} else {
			class463 var3 = new class463(this.field1186);
			int var4 = var1.field2693;
			int var5 = var1.field2697;
			int var6 = var1.field2709;
			byte var7 = var1.field2708;

			for (class512 var8 = (class512)var3.method8349(); var8 != null; var8 = (class512)var3.next()) {
				if (var8.field5143 != -1) {
					class232 var9 = class194.method2180(var8.field5144).method3705();
					if (null != var9) {
						var4 += var9.field2693;
						var5 += var9.field2697;
						var6 += var9.field2709;
					}
				}
			}

			class232 var11 = new class232(var4, var5, var6, var7);
			var11.method4704(var1);

			for (class512 var12 = (class512)var3.method8349(); null != var12; var12 = (class512)var3.next()) {
				if (-1 != var12.field5143) {
					class232 var10 = class194.method2180(var12.field5144).method3704(var12.field5143);
					if (null != var10) {
						var10.method4611(0, -var12.field5146, 0);
						var11.method4704(var10);
					}
				}
			}

			return var11;
		}
	}

	void method2314() {
		this.field1143 = false;
		this.field1173 = -1;
		this.field1198 = -1;
		this.field1175 = -1;
	}
}
