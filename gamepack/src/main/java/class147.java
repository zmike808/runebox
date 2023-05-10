public class class147 extends class140 {
	boolean field1690;
	byte field1686;
	byte field1687;
	byte field1688;
	byte field1689;
	// $FF: synthetic field
	final class143 this$0;

	class147(class143 var1) {
		this.this$0 = var1;
	}

	void method3152(class489 var1) {
		this.field1690 = var1.method8658() == 1;
		this.field1687 = var1.method8659();
		this.field1688 = var1.method8659();
		this.field1689 = var1.method8659();
		this.field1686 = var1.method8659();
	}

	void method3151(class151 var1) {
		var1.field1716 = this.field1690;
		var1.field1729 = this.field1687;
		var1.field1718 = this.field1688;
		var1.field1719 = this.field1689;
		var1.field1710 = this.field1686;
	}

	static final void method3190(boolean var0, class488 var1) {
		Client.field617 = 0;
		Client.field549 = 0;
		class31.method468(var1);
		class213.method4152(var0, var1);

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.field549; ++var3) {
			var4 = Client.field550[var3];
			class96 var5 = Client.field546[var4];
			int var6 = var1.method8658();
			int var7;
			if (0 != (var6 & 128)) {
				var7 = var1.method8658();
				var6 += var7 << 8;
			}

			if (0 != (var6 & 256)) {
				var7 = var1.method8658();
				var6 += var7 << 16;
			}

			int var8;
			int var9;
			if (0 != (var6 & 64)) {
				var7 = var1.method8660();
				if (var7 == 65535) {
					var7 = -1;
				}

				var8 = var1.method8691();
				if (var5.field1202 == var7 && var7 != -1) {
					var9 = class81.method2189(var7, (byte)5).field2315;
					if (var9 == 1) {
						var5.field1182 = 0;
						var5.field1183 = 0;
						var5.field1184 = var8;
						var5.field1185 = 0;
					}

					if (var9 == 2) {
						var5.field1185 = 0;
					}
				} else if (var7 == -1 || var5.field1202 == -1 || class81.method2189(var7, (byte)116).field2294 >= class81.method2189(var5.field1202, (byte)2).field2294) {
					var5.field1202 = var7;
					var5.field1182 = 0;
					var5.field1183 = 0;
					var5.field1184 = var8;
					var5.field1185 = 0;
					var5.field1211 = var5.field1206;
				}
			}

			if ((var6 & 32) != 0) {
				var5.field1160 = var1.method8660();
				var5.field1160 += var1.method8691() << 16;
				var7 = 16777215;
				if (var7 == var5.field1160) {
					var5.field1160 = -1;
				}
			}

			if (0 != (var6 & 2)) {
				var5.field1149 = var1.method8669();
				var5.field1161 = 100;
			}

			int var10;
			int var11;
			int var12;
			if (0 != (var6 & 4)) {
				var7 = var1.method8658();
				int var13;
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var10 = -1;
						var11 = -1;
						var12 = -1;
						var9 = var1.method8827();
						if (var9 == 32767) {
							var9 = var1.method8827();
							var11 = var1.method8827();
							var10 = var1.method8827();
							var12 = var1.method8827();
						} else if (var9 != 32766) {
							var11 = var1.method8827();
						} else {
							var9 = -1;
						}

						var13 = var1.method8827();
						var5.method2313(var9, var11, var10, var12, Client.field602, var13);
					}
				}

				var8 = var1.method8692();
				if (var8 > 0) {
					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var1.method8827();
						var11 = var1.method8827();
						if (var11 != 32767) {
							var12 = var1.method8827();
							var13 = var1.method8658();
							int var14 = var11 > 0 ? var1.method8692() : var13;
							var5.method2322(var10, Client.field602, var11, var12, var13, var14);
						} else {
							var5.method2326(var10);
						}
					}
				}
			}

			if (0 != (var6 & 8)) {
				var5.field1277 = class191.method6482(var1.method8701());
				Client.method3168(var5);
				var5.method2550();
			}

			if ((var6 & 1) != 0) {
				var7 = var1.method8660();
				var8 = var1.method8712();
				var5.method2319(0, var7, var8 >> 16, var8 & 65535);
			}

			if (0 != (var6 & 16)) {
				var7 = var1.method8700();
				var8 = var1.method8700();
				var5.field1143 = var1.method8691() == 1;
				if (Client.field498 >= 212) {
					var5.field1198 = var7;
					var5.field1175 = var8;
				} else {
					var9 = var5.field1171 - (var7 - Client.field2850 - Client.field2850) * 64;
					var10 = var5.field1138 - (var8 - Client.field2841 - Client.field2841) * 64;
					if (var9 != 0 || var10 != 0) {
						var12 = (int)(Math.atan2((double)var9, (double)var10) * 325.94932345220167D) & 2047;
						var5.field1173 = var12;
					}
				}
			}

			if (0 != (var6 & 16384)) {
				var5.field1188 = var1.method8659();
				var5.field1190 = var1.method8834();
				var5.field1189 = var1.method8834();
				var5.field1208 = var1.method8834();
				var5.field1192 = var1.method8700() + Client.field602;
				var5.field1193 = var1.method8737() + Client.field602;
				var5.field1194 = var1.method8701();
				var5.field1206 = 1;
				var5.field1211 = 0;
				var5.field1188 += var5.field1174[0];
				var5.field1190 += var5.field1176[0];
				var5.field1189 += var5.field1174[0];
				var5.field1208 += var5.field1176[0];
			}

			if ((var6 & 32768) != 0) {
				var5.field1212 = var1.method8664();
			}

			if ((var6 & 2048) != 0) {
				var5.field1169 = Client.field602 + var1.method8737();
				var5.field1157 = Client.field602 + var1.method8660();
				var5.field1181 = var1.method8788();
				var5.field1200 = var1.method8834();
				var5.field1201 = var1.method8694();
				var5.field1209 = (byte)var1.method8641();
			}

			if (0 != (var6 & 512)) {
				var5.method2502(var1.method8669());
			}

			if ((var6 & 8192) != 0) {
				var5.method2554(var1.method8658());
			}

			int[] var15;
			short[] var16;
			short[] var17;
			long var18;
			boolean var19;
			if (0 != (var6 & 4096)) {
				var7 = var1.method8641();
				if ((var7 & 1) == 1) {
					var5.method2559();
				} else {
					var15 = null;
					if (2 == (var7 & 2)) {
						var9 = var1.method8641();
						var15 = new int[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var1.method8660();
							var11 = var11 == 65535 ? -1 : var11;
							var15[var10] = var11;
						}
					}

					var16 = null;
					if ((var7 & 4) == 4) {
						var10 = 0;
						if (var5.field1277.field2027 != null) {
							var10 = var5.field1277.field2027.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var1.method8737();
						}
					}

					var17 = null;
					if ((var7 & 8) == 8) {
						var11 = 0;
						if (var5.field1277.field2035 != null) {
							var11 = var5.field1277.field2035.length;
						}

						var17 = new short[var11];

						for (var12 = 0; var12 < var11; ++var12) {
							var17[var12] = (short)var1.method8700();
						}
					}

					var19 = false;
					if ((var7 & 16) != 0) {
						var19 = var1.method8658() == 1;
					}

					var18 = (long)(++class96.field1275 - 1);
					var5.method2514(new class190(var18, var15, var16, var17, var19));
				}
			}

			if (0 != (var6 & 1024)) {
				var7 = var1.method8691();
				if ((var7 & 1) == 1) {
					var5.method2518();
				} else {
					var15 = null;
					if ((var7 & 2) == 2) {
						var9 = var1.method8691();
						var15 = new int[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var11 = var1.method8701();
							var11 = var11 == 65535 ? -1 : var11;
							var15[var10] = var11;
						}
					}

					var16 = null;
					if (4 == (var7 & 4)) {
						var10 = 0;
						if (null != var5.field1277.field2027) {
							var10 = var5.field1277.field2027.length;
						}

						var16 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var16[var11] = (short)var1.method8737();
						}
					}

					var17 = null;
					if ((var7 & 8) == 8) {
						var11 = 0;
						if (var5.field1277.field2035 != null) {
							var11 = var5.field1277.field2035.length;
						}

						var17 = new short[var11];

						for (var12 = 0; var12 < var11; ++var12) {
							var17[var12] = (short)var1.method8701();
						}
					}

					var19 = false;
					if (0 != (var7 & 16)) {
						var19 = var1.method8658() == 1;
					}

					var18 = (long)(++class96.field1278 - 1);
					var5.method2516(new class190(var18, var15, var16, var17, var19));
				}
			}

			if ((var6 & 131072) != 0) {
				var7 = var1.method8641();
				var15 = new int[8];
				var16 = new short[8];

				for (var10 = 0; var10 < 8; ++var10) {
					if ((var7 & 1 << var10) != 0) {
						var15[var10] = var1.method8710();
						var16[var10] = (short)var1.method8675();
					} else {
						var15[var10] = -1;
						var16[var10] = -1;
					}
				}

				var5.method2534(var15, var16);
			}

			if (0 != (var6 & 262144)) {
				var7 = var1.method8664();
				var5.field1137 = (var7 & 1) != 0 ? var1.method8660() : -2117504177 * var5.field1277.field2018 * 1526449071;
				var5.field1167 = 0 != (var7 & 2) ? var1.method8660() : var5.field1277.field2019;
				var5.field1146 = 0 != (var7 & 4) ? var1.method8701() : var5.field1277.field2020;
				var5.field1147 = 0 != (var7 & 8) ? var1.method8660() : var5.field1277.field2021;
				var5.field1148 = (var7 & 16) != 0 ? var1.method8660() : 429445119 * var5.field1277.field2022 * 1030172671;
				var5.field1155 = 0 != (var7 & 32) ? var1.method8660() : var5.field1277.field2023;
				var5.field1150 = (var7 & 64) != 0 ? var1.method8660() : -1565402875 * var5.field1277.field2049 * 1104808909;
				var5.field1151 = (var7 & 128) != 0 ? var1.method8737() : var5.field1277.field2009;
				var5.field1152 = 0 != (var7 & 256) ? var1.method8737() : -1171795391 * var5.field1277.field2026 * -257868351;
				var5.field1153 = 0 != (var7 & 512) ? var1.method8737() : var5.field1277.field2038;
				var5.field1154 = 0 != (var7 & 1024) ? var1.method8660() : -1186532489 * var5.field1277.field2024 * -237251001;
				var5.field1197 = (var7 & 2048) != 0 ? var1.method8660() : var5.field1277.field2029;
				var5.field1156 = (var7 & 4096) != 0 ? var1.method8700() : var5.field1277.field2030;
				var5.field1158 = (var7 & 8192) != 0 ? var1.method8701() : var5.field1277.field2031;
				var5.field1139 = (var7 & 16384) != 0 ? var1.method8700() : var5.field1277.field2050;
			}

			if ((var6 & 65536) != 0) {
				var7 = var1.method8691();

				for (var8 = 0; var8 < var7; ++var8) {
					var9 = var1.method8641();
					var10 = var1.method8701();
					var11 = var1.method8712();
					var5.method2319(var9, var10, var11 >> 16, var11 & 65535);
				}
			}
		}

		for (var3 = 0; var3 < Client.field617; ++var3) {
			var4 = Client.field618[var3];
			if (Client.field602 != Client.field546[var4].field1195) {
				Client.field546[var4].field1277 = null;
				Client.field546[var4] = null;
			}
		}

		if (var1.field4989 != Client.field753.field1388) {
			throw new RuntimeException(var1.field4989 + class97.field1295 + Client.field753.field1388);
		} else {
			for (var3 = 0; var3 < Client.field737; ++var3) {
				if (Client.field546[Client.field548[var3]] == null) {
					throw new RuntimeException(var3 + class97.field1295 + Client.field737);
				}
			}

		}
	}
}
