public final class class88 extends class91 {
	boolean field1096;
	boolean field1105;
	boolean field1111;
	class232 field1098;
	class314 field1097;
	class413 field1084;
	class413 field1109;
	class413 field1110;
	class513 field1089;
	int field1085;
	int field1086;
	int field1087;
	int field1090;
	int field1091;
	int field1092;
	int field1093;
	int field1094;
	int field1095;
	int field1099;
	int field1100;
	int field1101;
	int field1102;
	int field1104;
	int field1106;
	int field1107;
	int field1108;
	int field1112;
	int field1113;
	String[] field1103;

	class88() {
		this.field1090 = -1;
		this.field1108 = -1;
		this.field1103 = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.field1103[var1] = "";
		}

		this.field1102 = 0;
		this.field1085 = 0;
		this.field1093 = 0;
		this.field1094 = 0;
		this.field1096 = false;
		this.field1104 = 0;
		this.field1105 = false;
		this.field1084 = class413.field4605;
		this.field1109 = class413.field4605;
		this.field1110 = class413.field4605;
		this.field1111 = false;
	}

	final void method2232(class489 var1) {
		var1.field4989 = 0;
		int var3 = var1.method8658();
		boolean var4 = true;
		this.field1090 = var1.method8659();
		this.field1108 = var1.method8659();
		int var5 = -1;
		this.field1104 = 0;
		int[] var6 = new int[12];

		int var8;
		int var9;
		int var10;
		for (int var7 = 0; var7 < 12; ++var7) {
			var8 = var1.method8658();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				var9 = var1.method8658();
				var6[var7] = var9 + (var8 << 8);
				if (var7 == 0 && 65535 == var6[0]) {
					var5 = var1.method8660();
					break;
				}

				if (var6[var7] >= 512) {
					var10 = class92.method2352(var6[var7] - 512).field2255;
					if (var10 != 0) {
						this.field1104 = var10;
					}
				}
			}
		}

		int[] var15 = null;
		if (Client.field498 >= 213) {
			var15 = new int[12];

			for (var8 = 0; var8 < 12; ++var8) {
				var9 = var1.method8658();
				if (var9 == 0) {
					var15[var8] = 0;
				} else {
					var10 = var1.method8658();
					var15[var8] = (var9 << 8) + var10;
				}
			}
		}

		int[] var16 = new int[5];

		for (var9 = 0; var9 < 5; ++var9) {
			var10 = var1.method8658();
			if (var10 < 0 || var10 >= class314.field3508[var9].length) {
				var10 = 0;
			}

			var16[var9] = var10;
		}

		super.field1139 = var1.method8660();
		if (65535 == super.field1139) {
			super.field1139 = -1;
		}

		super.field1137 = var1.method8660();
		if (65535 == super.field1137) {
			super.field1137 = -1;
		}

		super.field1167 = super.field1137;
		super.field1146 = var1.method8660();
		if (super.field1146 == 65535) {
			super.field1146 = -1;
		}

		super.field1147 = var1.method8660();
		if (65535 == super.field1147) {
			super.field1147 = -1;
		}

		super.field1148 = var1.method8660();
		if (super.field1148 == 65535) {
			super.field1148 = -1;
		}

		super.field1155 = var1.method8660();
		if (65535 == super.field1155) {
			super.field1155 = -1;
		}

		super.field1150 = var1.method8660();
		if (super.field1150 == 65535) {
			super.field1150 = -1;
		}

		this.field1089 = new class513(var1.method8669(), Client.field889);
		this.method2242();
		this.method2237();
		this.method2240();
		if (Client.field3454 == this) {
			class516.field5159 = this.field1089.method9256();
		}

		this.field1102 = var1.method8658();
		this.field1085 = var1.method8660();
		this.field1105 = var1.method8658() == 1;
		if (Client.field490 == 0 && Client.field682 >= 2) {
			this.field1105 = false;
		}

		class180[] var17 = null;
		boolean var18 = false;
		int var11 = var1.method8660();
		var18 = (var11 >> 15 & 1) == 1;
		int var12;
		if (var11 > 0 && var11 != 32768) {
			var17 = new class180[12];

			for (var12 = 0; var12 < 12; ++var12) {
				int var13 = var11 >> 12 - var12 & 1;
				if (var13 == 1) {
					var17[var12] = class73.method2060(var6[var12] - 512, var1);
				}
			}
		}

		for (var12 = 0; var12 < 3; ++var12) {
			this.field1103[var12] = var1.method8669();
		}

		int var14 = var1.method8658();
		if (this.field1097 == null) {
			this.field1097 = new class314();
		}

		this.field1097.method5797(var15, var6, var17, var18, var16, var3, var5, var14);
	}

	boolean method2233() {
		if (this.field1084 == class413.field4605) {
			this.method2271();
		}

		return this.field1084 == class413.field4602;
	}

	void method2242() {
		this.field1084 = class413.field4605;
	}

	void method2271() {
		this.field1084 = class67.field804.method1788(this.field1089) ? class413.field4602 : class413.field4603;
	}

	boolean method2276() {
		if (class413.field4605 == this.field1109) {
			this.method2238();
		}

		return this.field1109 == class413.field4602;
	}

	void method2237() {
		this.field1109 = class413.field4605;
	}

	void method2238() {
		this.field1109 = class67.field1426 != null && class67.field1426.method7640(this.field1089) ? class413.field4602 : class413.field4603;
	}

	void method2239() {
		for (int var2 = 0; var2 < 4; ++var2) {
			if (Client.field750[var2] != null && Client.field750[var2].method3209(this.field1089.method9256()) != -1 && var2 != 2) {
				this.field1110 = class413.field4602;
				return;
			}
		}

		this.field1110 = class413.field4603;
	}

	void method2240() {
		this.field1110 = class413.field4605;
	}

	boolean method2241() {
		if (this.field1110 == class413.field4605) {
			this.method2239();
		}

		return this.field1110 == class413.field4602;
	}

	int method2262() {
		return this.field1097 != null && -1 != this.field1097.field3513 ? class191.method6482(this.field1097.field3513).field2042 : 1;
	}

	protected final class232 method4541() {
		if (this.field1097 == null) {
			return null;
		} else {
			class204 var2 = super.field1202 != -1 && 0 == super.field1184 ? class81.method2189(super.field1202, (byte)73) : null;
			class204 var3 = -1 != super.field1187 && !this.field1096 && (super.field1187 != super.field1139 || var2 == null) ? class81.method2189(super.field1187, (byte)57) : null;
			class232 var4 = this.field1097.method5805(var2, super.field1182, var3, super.field1178);
			if (var4 == null) {
				return null;
			} else {
				var4.method4654();
				super.field1196 = var4.field2619;
				int var5 = var4.field2697;
				if (!this.field1096) {
					var4 = this.method2318(var4);
				}

				if (!this.field1096 && this.field1098 != null) {
					if (Client.field602 >= this.field1094) {
						this.field1098 = null;
					}

					if (Client.field602 >= this.field1093 && Client.field602 < this.field1094) {
						class232 var6 = this.field1098;
						var6.method4611(this.field1095 - super.field1171, this.field1086 - this.field1092, this.field1099 - super.field1138);
						if (super.field1168 == 512) {
							var6.method4684();
							var6.method4684();
							var6.method4684();
						} else if (1024 == super.field1168) {
							var6.method4684();
							var6.method4684();
						} else if (1536 == super.field1168) {
							var6.method4684();
						}

						class232[] var7 = new class232[]{var4, var6};
						var4 = new class232(var7, 2);
						if (super.field1168 == 512) {
							var6.method4684();
						} else if (1024 == super.field1168) {
							var6.method4684();
							var6.method4684();
						} else if (super.field1168 == 1536) {
							var6.method4684();
							var6.method4684();
							var6.method4684();
						}

						var6.method4611(super.field1171 - this.field1095, this.field1092 - this.field1086, super.field1138 - this.field1099);
					}
				}

				var4.field2714 = true;
				if (super.field1209 != 0 && Client.field602 >= super.field1169 && Client.field602 < super.field1157) {
					var4.field2757 = super.field1181;
					var4.field2715 = super.field1200;
					var4.field2754 = super.field1201;
					var4.field2762 = super.field1209;
					var4.field2756 = (short)var5;
				} else {
					var4.field2762 = 0;
				}

				return var4;
			}
		}
	}

	final void method2252(int var1, int var2, class211 var3) {
		if (super.field1202 != -1 && class81.method2189(super.field1202, (byte)61).field2314 == 1) {
			super.field1202 = -1;
		}

		this.method2314();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.field1174[0] >= 0 && super.field1174[0] < 104 && super.field1176[0] >= 0 && super.field1176[0] < 104) {
				if (class211.field2388 == var3) {
					class56.method1125(this, var1, var2, class211.field2388);
				}

				this.method2246(var1, var2, var3);
			} else {
				this.method2245(var1, var2);
			}
		} else {
			this.method2245(var1, var2);
		}

	}

	void method2245(int var1, int var2) {
		super.field1206 = 0;
		super.field1211 = 0;
		super.field1210 = 0;
		super.field1174[0] = var1;
		super.field1176[0] = var2;
		int var4 = this.method2262();
		super.field1171 = 128 * super.field1174[0] + var4 * 64;
		super.field1138 = var4 * 64 + 128 * super.field1176[0];
	}

	final void method2246(int var1, int var2, class211 var3) {
		if (super.field1206 < 9) {
			++super.field1206;
		}

		for (int var5 = super.field1206; var5 > 0; --var5) {
			super.field1174[var5] = super.field1174[var5 - 1];
			super.field1176[var5] = super.field1176[var5 - 1];
			super.field1199[var5] = super.field1199[var5 - 1];
		}

		super.field1174[0] = var1;
		super.field1176[0] = var2;
		super.field1199[0] = var3;
	}

	final boolean method2315() {
		return this.field1097 != null;
	}
}
