import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class38 extends class449 {
	byte[][][] field268;
	int field262;
	int field265;
	int[] field263;
	int[] field264;
	int[] field266;
	Field[] field261;
	Method[] field267;

	class38() {
	}

	static final void method727(class91 var0, int var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		class204 var14;
		if (var0.field1192 >= Client.field602) {
			var3 = Math.max(1, var0.field1192 - Client.field602);
			var4 = var0.field1188 * 128 + var0.field1141 * 64;
			var5 = var0.field1141 * 64 + var0.field1190 * 128;
			var0.field1171 += (var4 - var0.field1171) / var3;
			var0.field1138 += (var5 - var0.field1138) / var3;
			var0.field1210 = 0;
			var0.field1168 = var0.field1194;
		} else {
			int var9;
			if (var0.field1193 >= Client.field602) {
				boolean var12 = var0.field1193 == Client.field602 || -1 == var0.field1202 || var0.field1184 != 0;
				if (!var12) {
					class204 var13 = class81.method2189(var0.field1202, (byte)113);
					if (null != var13 && !var13.method4004()) {
						var12 = 1 + var0.field1183 > var13.field2304[var0.field1182];
					} else {
						var12 = true;
					}
				}

				if (var12) {
					var4 = var0.field1193 - var0.field1192;
					var5 = Client.field602 - var0.field1192;
					var6 = var0.field1188 * 128 + var0.field1141 * 64;
					var7 = var0.field1190 * 128 + var0.field1141 * 64;
					var8 = var0.field1141 * 64 + var0.field1189 * 128;
					var9 = var0.field1141 * 64 + var0.field1208 * 128;
					var0.field1171 = (var6 * (var4 - var5) + var8 * var5) / var4;
					var0.field1138 = (var5 * var9 + (var4 - var5) * var7) / var4;
				}

				var0.field1210 = 0;
				var0.field1168 = var0.field1194;
				var0.field1144 = var0.field1168;
			} else {
				var0.field1187 = var0.field1139;
				if (var0.field1206 == 0) {
					var0.field1210 = 0;
				} else {
					label399: {
						if (var0.field1202 != -1 && var0.field1184 == 0) {
							var14 = class81.method2189(var0.field1202, (byte)73);
							if (var0.field1211 > 0 && var14.field2313 == 0) {
								++var0.field1210;
								break label399;
							}

							if (var0.field1211 <= 0 && 0 == var14.field2314) {
								++var0.field1210;
								break label399;
							}
						}

						var3 = var0.field1171;
						var4 = var0.field1138;
						var5 = var0.field1141 * 64 + 128 * var0.field1174[var0.field1206 - 1];
						var6 = var0.field1176[var0.field1206 - 1] * 128 + var0.field1141 * 64;
						if (var3 < var5) {
							if (var4 < var6) {
								var0.field1168 = 1280;
							} else if (var4 > var6) {
								var0.field1168 = 1792;
							} else {
								var0.field1168 = 1536;
							}
						} else if (var3 > var5) {
							if (var4 < var6) {
								var0.field1168 = 768;
							} else if (var4 > var6) {
								var0.field1168 = 256;
							} else {
								var0.field1168 = 512;
							}
						} else if (var4 < var6) {
							var0.field1168 = 1024;
						} else if (var4 > var6) {
							var0.field1168 = 0;
						}

						class211 var18 = var0.field1199[var0.field1206 - 1];
						if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
							var8 = var0.field1168 - var0.field1144 & 2047;
							if (var8 > 1024) {
								var8 -= 2048;
							}

							var9 = var0.field1147;
							if (var8 >= -256 && var8 <= 256) {
								var9 = var0.field1146;
							} else if (var8 >= 256 && var8 < 768) {
								var9 = var0.field1155;
							} else if (var8 >= -768 && var8 <= -256) {
								var9 = var0.field1148;
							}

							if (var9 == -1) {
								var9 = var0.field1146;
							}

							var0.field1187 = var9;
							int var10 = 4;
							boolean var11 = true;
							if (var0 instanceof class96) {
								var11 = ((class96)var0).field1277.field2014;
							}

							if (var11) {
								if (var0.field1144 != var0.field1168 && var0.field1160 == -1 && 0 != var0.field1191) {
									var10 = 2;
								}

								if (var0.field1206 > 2) {
									var10 = 6;
								}

								if (var0.field1206 > 3) {
									var10 = 8;
								}

								if (var0.field1210 > 0 && var0.field1206 > 1) {
									var10 = 8;
									--var0.field1210;
								}
							} else {
								if (var0.field1206 > 1) {
									var10 = 6;
								}

								if (var0.field1206 > 2) {
									var10 = 8;
								}

								if (var0.field1210 > 0 && var0.field1206 > 1) {
									var10 = 8;
									--var0.field1210;
								}
							}

							if (var18 == class211.field2388) {
								var10 <<= 1;
							} else if (var18 == class211.field2389) {
								var10 >>= 1;
							}

							if (var10 >= 8) {
								if (var0.field1187 == var0.field1146 && var0.field1150 != -1) {
									var0.field1187 = var0.field1150;
								} else if (var0.field1187 == var0.field1147 && -1 != var0.field1151) {
									var0.field1187 = var0.field1151;
								} else if (var0.field1148 == var0.field1187 && var0.field1152 != -1) {
									var0.field1187 = var0.field1152;
								} else if (var0.field1155 == var0.field1187 && var0.field1153 != -1) {
									var0.field1187 = var0.field1153;
								}
							} else if (var10 <= 1) {
								if (var0.field1146 == var0.field1187 && var0.field1154 != -1) {
									var0.field1187 = var0.field1154;
								} else if (var0.field1147 == var0.field1187 && var0.field1197 != -1) {
									var0.field1187 = var0.field1197;
								} else if (var0.field1148 == var0.field1187 && var0.field1156 != -1) {
									var0.field1187 = var0.field1156;
								} else if (var0.field1187 == var0.field1155 && var0.field1158 != -1) {
									var0.field1187 = var0.field1158;
								}
							}

							if (var5 != var3 || var4 != var6) {
								if (var3 < var5) {
									var0.field1171 += var10;
									if (var0.field1171 > var5) {
										var0.field1171 = var5;
									}
								} else if (var3 > var5) {
									var0.field1171 -= var10;
									if (var0.field1171 < var5) {
										var0.field1171 = var5;
									}
								}

								if (var4 < var6) {
									var0.field1138 += var10;
									if (var0.field1138 > var6) {
										var0.field1138 = var6;
									}
								} else if (var4 > var6) {
									var0.field1138 -= var10;
									if (var0.field1138 < var6) {
										var0.field1138 = var6;
									}
								}
							}

							if (var0.field1171 == var5 && var0.field1138 == var6) {
								--var0.field1206;
								if (var0.field1211 > 0) {
									--var0.field1211;
								}
							}
						} else {
							var0.field1171 = var5;
							var0.field1138 = var6;
							--var0.field1206;
							if (var0.field1211 > 0) {
								--var0.field1211;
							}
						}
					}
				}
			}
		}

		if (var0.field1171 < 128 || var0.field1138 < 128 || var0.field1171 >= 13184 || var0.field1138 >= 13184) {
			var0.field1202 = -1;
			var0.field1192 = 0;
			var0.field1193 = 0;
			var0.method2321();
			var0.field1171 = 128 * var0.field1174[0] + var0.field1141 * 64;
			var0.field1138 = var0.field1141 * 64 + 128 * var0.field1176[0];
			var0.method2332();
		}

		if (var0 == Client.field3454 && (var0.field1171 < 1536 || var0.field1138 < 1536 || var0.field1171 >= 11776 || var0.field1138 >= 11776)) {
			var0.field1202 = -1;
			var0.field1192 = 0;
			var0.field1193 = 0;
			var0.method2321();
			var0.field1171 = 128 * var0.field1174[0] + var0.field1141 * 64;
			var0.field1138 = var0.field1141 * 64 + 128 * var0.field1176[0];
			var0.method2332();
		}

		if (-1 != var0.field1160) {
			var14 = null;
			var4 = 65536;
			Object var15;
			if (var0.field1160 < var4) {
				var15 = Client.field546[var0.field1160];
			} else {
				var15 = Client.field611[var0.field1160 - var4];
			}

			if (null != var15) {
				var5 = var0.field1171 - ((class91)var15).field1171;
				var6 = var0.field1138 - ((class91)var15).field1138;
				if (var5 != 0 || var6 != 0) {
					var8 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167D) & 2047;
					var0.field1168 = var8;
				}
			} else if (var0.field1172) {
				var0.field1160 = -1;
				var0.field1172 = false;
			}
		}

		if (0 == var0.field1206 || var0.field1210 > 0) {
			var3 = -1;
			if (var0.field1198 != -1 && var0.field1175 != -1) {
				var4 = var0.field1198 * 128 - Client.field2850 * 128 + 64;
				var5 = var0.field1175 * 128 - Client.field2841 * 128 + 64;
				var6 = var0.field1171 - var4;
				var7 = var0.field1138 - var5;
				if (var6 != 0 || var7 != 0) {
					var8 = (int)(Math.atan2((double)var6, (double)var7) * 325.94932345220167D) & 2047;
					var3 = var8;
				}
			} else if (var0.field1173 != -1) {
				var3 = var0.field1173;
			}

			if (var3 != -1) {
				var0.field1168 = var3;
				if (var0.field1143) {
					var0.field1144 = var0.field1168;
				}
			}

			var0.method2314();
		}

		var3 = var0.field1168 - var0.field1144 & 2047;
		if (var3 != 0) {
			boolean var16 = true;
			boolean var17 = true;
			++var0.field1204;
			var6 = var3 > 1024 ? -1 : 1;
			var0.field1144 += var6 * var0.field1191;
			boolean var19 = true;
			if (var3 < var0.field1191 || var3 > 2048 - var0.field1191) {
				var0.field1144 = var0.field1168;
				var19 = false;
			}

			if (var0.field1191 > 0 && var0.field1187 == var0.field1139 && (var0.field1204 > 25 || var19)) {
				if (var6 == -1 && var0.field1137 != -1) {
					var0.field1187 = var0.field1137;
				} else if (var6 == 1 && var0.field1167 != -1) {
					var0.field1187 = var0.field1167;
				} else {
					var0.field1187 = var0.field1146;
				}
			}

			var0.field1144 &= 2047;
		} else {
			if (var0.field1172) {
				var0.field1160 = -1;
				var0.field1172 = false;
			}

			var0.field1204 = 0;
		}

		class343.method6440(var0);
	}
}
