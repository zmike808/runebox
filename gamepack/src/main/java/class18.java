import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class class18 implements SSLSession {
	// $FF: synthetic field
	final class13 this$1;

	class18(class13 var1) {
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field62;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	static final void method250(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		class96 var10;
		class289 var11;
		if (var2 == 11) {
			var10 = Client.field546[var3];
			if (null != var10) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3179, Client.field753.field1385);
				var11.field3212.method8734(var3);
				var11.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				Client.field753.method2735(var11);
			}
		}

		class289 var13;
		if (var2 == 6) {
			Client.field515 = var7;
			Client.field676 = var8;
			Client.field607 = 2;
			Client.field606 = 0;
			Client.field735 = var0;
			Client.field487 = var1;
			var13 = class331.method6337(class287.field3101, Client.field753.field1385);
			var13.field3212.method8698(var3);
			var13.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
			var13.field3212.method8698(var1 + Client.field2841);
			var13.field3212.method8734(Client.field2850 + var0);
			Client.field753.method2735(var13);
		}

		if (var2 == 13) {
			var10 = Client.field546[var3];
			if (var10 != null) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3188, Client.field753.field1385);
				var11.field3212.method8695(Client.field722.method4076(82) ? 1 : 0);
				var11.field3212.method8698(var3);
				Client.field753.method2735(var11);
			}
		}

		if (var2 == 5) {
			Client.field515 = var7;
			Client.field676 = var8;
			Client.field607 = 2;
			Client.field606 = 0;
			Client.field735 = var0;
			Client.field487 = var1;
			var13 = class331.method6337(class287.field3144, Client.field753.field1385);
			var13.field3212.method8859(Client.field2850 + var0);
			var13.field3212.method8734(var3);
			var13.field3212.method8859(Client.field2841 + var1);
			var13.field3212.method8716(Client.field722.method4076(82) ? 1 : 0);
			Client.field753.method2735(var13);
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			Client.field1542.method8194(var2, var3, new class308(var0), new class308(var1));
		}

		if (var2 == 19) {
			Client.field515 = var7;
			Client.field676 = var8;
			Client.field607 = 2;
			Client.field606 = 0;
			Client.field735 = var0;
			Client.field487 = var1;
			var13 = class331.method6337(class287.field3133, Client.field753.field1385);
			var13.field3212.method8698(var1 + Client.field2841);
			var13.field3212.method8859(var3);
			var13.field3212.method8695(Client.field722.method4076(82) ? 1 : 0);
			var13.field3212.method8859(Client.field2850 + var0);
			Client.field753.method2735(var13);
		}

		if (var2 == 1001) {
			Client.field515 = var7;
			Client.field676 = var8;
			Client.field607 = 2;
			Client.field606 = 0;
			Client.field735 = var0;
			Client.field487 = var1;
			var13 = class331.method6337(class287.field3171, Client.field753.field1385);
			var13.field3212.method8716(Client.field722.method4076(82) ? 1 : 0);
			var13.field3212.method8859(var3);
			var13.field3212.method8698(Client.field2850 + var0);
			var13.field3212.method8859(var1 + Client.field2841);
			Client.field753.method2735(var13);
		}

		if (var2 == 23) {
			if (Client.field669) {
				Client.field180.method4386();
			} else {
				Client.field180.method4405(Client.field231, var0, var1, true);
			}
		}

		int var12;
		class317 var14;
		if (var2 == 28) {
			var13 = class331.method6337(class287.field3132, Client.field753.field1385);
			var13.field3212.method8644(var1);
			Client.field753.method2735(var13);
			var14 = class166.method3349(var1);
			if (var14 != null && var14.field3695 != null && var14.field3695[0][0] == 5) {
				var12 = var14.field3695[0][1];
				class307.field3482[var12] = 1 - class307.field3482[var12];
				class8.method54(var12);
			}
		}

		class88 var15;
		if (var2 == 47) {
			var15 = Client.field611[var3];
			if (var15 != null) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3161, Client.field753.field1385);
				var11.field3212.method8716(Client.field722.method4076(82) ? 1 : 0);
				var11.field3212.method8734(var3);
				Client.field753.method2735(var11);
			}
		}

		if (var2 == 7) {
			var10 = Client.field546[var3];
			if (null != var10) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3192, Client.field753.field1385);
				var11.field3212.method8805(Client.field722.method4076(82) ? 1 : 0);
				var11.field3212.method8644(Client.field3365);
				var11.field3212.method8698(var3);
				var11.field3212.method8859(Client.field1678);
				var11.field3212.method8642(Client.field2985);
				Client.field753.method2735(var11);
			}
		}

		if (var2 == 50) {
			var15 = Client.field611[var3];
			if (null != var15) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3117, Client.field753.field1385);
				var11.field3212.method8859(var3);
				var11.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				Client.field753.method2735(var11);
			}
		}

		if (var2 == 10) {
			var10 = Client.field546[var3];
			if (var10 != null) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3165, Client.field753.field1385);
				var11.field3212.method8698(var3);
				var11.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				Client.field753.method2735(var11);
			}
		}

		class317 var17;
		if (var2 == 57 || var2 == 1007) {
			var17 = class317.method881(var1, var0);
			if (var17 != null) {
				class61.method1201(var3, var1, var0, var4, var6);
			}
		}

		if (var2 == 14) {
			var15 = Client.field611[var3];
			if (null != var15) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3130, Client.field753.field1385);
				var11.field3212.method8642(var3);
				var11.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				var11.field3212.method8698(Client.field2985);
				var11.field3212.method8644(Client.field3365);
				var11.field3212.method8642(Client.field1678);
				Client.field753.method2735(var11);
			}
		}

		if (var2 == 48) {
			var15 = Client.field611[var3];
			if (null != var15) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3121, Client.field753.field1385);
				var11.field3212.method8716(Client.field722.method4076(82) ? 1 : 0);
				var11.field3212.method8642(var3);
				Client.field753.method2735(var11);
			}
		}

		if (var2 == 9) {
			var10 = Client.field546[var3];
			if (var10 != null) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3190, Client.field753.field1385);
				var11.field3212.method8695(Client.field722.method4076(82) ? 1 : 0);
				var11.field3212.method8859(var3);
				Client.field753.method2735(var11);
			}
		}

		if (var2 == 51) {
			var15 = Client.field611[var3];
			if (null != var15) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var11 = class331.method6337(class287.field3107, Client.field753.field1385);
				var11.field3212.method8698(var3);
				var11.field3212.method8716(Client.field722.method4076(82) ? 1 : 0);
				Client.field753.method2735(var11);
			}
		}

		if (var2 == 3) {
			Client.field515 = var7;
			Client.field676 = var8;
			Client.field607 = 2;
			Client.field606 = 0;
			Client.field735 = var0;
			Client.field487 = var1;
			var13 = class331.method6337(class287.field3109, Client.field753.field1385);
			var13.field3212.method8734(Client.field2850 + var0);
			var13.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
			var13.field3212.method8859(var1 + Client.field2841);
			var13.field3212.method8698(var3);
			Client.field753.method2735(var13);
		}

		if (var2 == 25) {
			var17 = class317.method881(var1, var0);
			if (null != var17) {
				Client.method3392();
				Client.method287(var1, var0, class318.method3742(class26.method353(var17)), var4);
				Client.field649 = 0;
				Client.field663 = Client.method5750(var17);
				if (null == Client.field663) {
					Client.field663 = class337.field3889;
				}

				if (var17.field3651) {
					Client.field655 = var17.field3650 + class97.method7285(16777215);
				} else {
					Client.field655 = class97.method7285(65280) + var17.field3699 + class97.method7285(16777215);
				}
			}

		} else {
			class289 var16;
			if (var2 == 24) {
				var17 = class166.method3349(var1);
				if (null != var17) {
					boolean var18 = true;
					if (var17.field3686 > 0) {
						var18 = class61.method1200(var17);
					}

					if (var18) {
						var16 = class331.method6337(class287.field3132, Client.field753.field1385);
						var16.field3212.method8644(var1);
						Client.field753.method2735(var16);
					}
				}
			}

			if (var2 == 1003) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				var10 = Client.field546[var3];
				if (var10 != null) {
					class191 var19 = var10.field1277;
					if (null != var19.field2045) {
						var19 = var19.method3642();
					}

					if (null != var19) {
						var16 = class331.method6337(class287.field3159, Client.field753.field1385);
						var16.field3212.method8734(var19.field2012);
						Client.field753.method2735(var16);
					}
				}
			}

			if (var2 == 20) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3127, Client.field753.field1385);
				var13.field3212.method8698(Client.field2850 + var0);
				var13.field3212.method8695(Client.field722.method4076(82) ? 1 : 0);
				var13.field3212.method8859(var3);
				var13.field3212.method8698(var1 + Client.field2841);
				Client.field753.method2735(var13);
			}

			if (var2 == 49) {
				var15 = Client.field611[var3];
				if (var15 != null) {
					Client.field515 = var7;
					Client.field676 = var8;
					Client.field607 = 2;
					Client.field606 = 0;
					Client.field735 = var0;
					Client.field487 = var1;
					var11 = class331.method6337(class287.field3156, Client.field753.field1385);
					var11.field3212.method8698(var3);
					var11.field3212.method8716(Client.field722.method4076(82) ? 1 : 0);
					Client.field753.method2735(var11);
				}
			}

			if (var2 == 8) {
				var10 = Client.field546[var3];
				if (var10 != null) {
					Client.field515 = var7;
					Client.field676 = var8;
					Client.field607 = 2;
					Client.field606 = 0;
					Client.field735 = var0;
					Client.field487 = var1;
					var11 = class331.method6337(class287.field3151, Client.field753.field1385);
					var11.field3212.method8698(Client.field600);
					var11.field3212.method8645(Client.field2805);
					var11.field3212.method8734(var3);
					var11.field3212.method8698(Client.field658);
					var11.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
					Client.field753.method2735(var11);
				}
			}

			if (var2 == 2) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3123, Client.field753.field1385);
				var13.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				var13.field3212.method8734(var3);
				var13.field3212.method8734(Client.field600);
				var13.field3212.method8734(var0 + Client.field2850);
				var13.field3212.method8859(Client.field658);
				var13.field3212.method8645(Client.field2805);
				var13.field3212.method8859(var1 + Client.field2841);
				Client.field753.method2735(var13);
			}

			if (var2 == 1002) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				var13 = class331.method6337(class287.field3108, Client.field753.field1385);
				var13.field3212.method8859(var3);
				Client.field753.method2735(var13);
			}

			if (var2 == 45) {
				var15 = Client.field611[var3];
				if (null != var15) {
					Client.field515 = var7;
					Client.field676 = var8;
					Client.field607 = 2;
					Client.field606 = 0;
					Client.field735 = var0;
					Client.field487 = var1;
					var11 = class331.method6337(class287.field3134, Client.field753.field1385);
					var11.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
					var11.field3212.method8734(var3);
					Client.field753.method2735(var11);
				}
			}

			if (var2 == 16) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3114, Client.field753.field1385);
				var13.field3212.method8642(Client.field2985);
				var13.field3212.method8859(Client.field2850 + var0);
				var13.field3212.method8859(var3);
				var13.field3212.method8859(Client.field2841 + var1);
				var13.field3212.method8642(Client.field1678);
				var13.field3212.method8695(Client.field722.method4076(82) ? 1 : 0);
				var13.field3212.method8645(Client.field3365);
				Client.field753.method2735(var13);
			}

			if (var2 == 46) {
				var15 = Client.field611[var3];
				if (var15 != null) {
					Client.field515 = var7;
					Client.field676 = var8;
					Client.field607 = 2;
					Client.field606 = 0;
					Client.field735 = var0;
					Client.field487 = var1;
					var11 = class331.method6337(class287.field3131, Client.field753.field1385);
					var11.field3212.method8734(var3);
					var11.field3212.method8805(Client.field722.method4076(82) ? 1 : 0);
					Client.field753.method2735(var11);
				}
			}

			if (var2 == 4) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3148, Client.field753.field1385);
				var13.field3212.method8859(Client.field2850 + var0);
				var13.field3212.method8734(Client.field2841 + var1);
				var13.field3212.method8859(var3);
				var13.field3212.method8805(Client.field722.method4076(82) ? 1 : 0);
				Client.field753.method2735(var13);
			}

			if (var2 == 44) {
				var15 = Client.field611[var3];
				if (null != var15) {
					Client.field515 = var7;
					Client.field676 = var8;
					Client.field607 = 2;
					Client.field606 = 0;
					Client.field735 = var0;
					Client.field487 = var1;
					var11 = class331.method6337(class287.field3128, Client.field753.field1385);
					var11.field3212.method8805(Client.field722.method4076(82) ? 1 : 0);
					var11.field3212.method8642(var3);
					Client.field753.method2735(var11);
				}
			}

			if (var2 == 18) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3183, Client.field753.field1385);
				var13.field3212.method8859(var3);
				var13.field3212.method8642(Client.field2841 + var1);
				var13.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				var13.field3212.method8734(var0 + Client.field2850);
				Client.field753.method2735(var13);
			}

			if (var2 == 58) {
				var17 = class317.method881(var1, var0);
				if (var17 != null) {
					if (null != var17.field3678) {
						class84 var20 = new class84();
						var20.field1048 = var17;
						var20.field1045 = var3;
						var20.field1049 = var6;
						var20.field1052 = var17.field3678;
						class67.method2351(var20);
					}

					var11 = class331.method6337(class287.field3119, Client.field753.field1385);
					var11.field3212.method8734(var0);
					var11.field3212.method8642(var4);
					var11.field3212.method8711(Client.field2805);
					var11.field3212.method8859(Client.field658);
					var11.field3212.method8645(var1);
					var11.field3212.method8698(Client.field600);
					Client.field753.method2735(var11);
				}
			}

			if (var2 == 30 && null == Client.field661) {
				Client.method2190(var1, var0);
				Client.field661 = class317.method881(var1, var0);
				Client.method3176(Client.field661);
			}

			if (var2 == 26) {
				Client.method3203();
			}

			if (var2 == 15) {
				var15 = Client.field611[var3];
				if (var15 != null) {
					Client.field515 = var7;
					Client.field676 = var8;
					Client.field607 = 2;
					Client.field606 = 0;
					Client.field735 = var0;
					Client.field487 = var1;
					var11 = class331.method6337(class287.field3146, Client.field753.field1385);
					var11.field3212.method8859(Client.field658);
					var11.field3212.method8698(Client.field600);
					var11.field3212.method8734(var3);
					var11.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
					var11.field3212.method8644(Client.field2805);
					Client.field753.method2735(var11);
				}
			}

			if (var2 == 12) {
				var10 = Client.field546[var3];
				if (var10 != null) {
					Client.field515 = var7;
					Client.field676 = var8;
					Client.field607 = 2;
					Client.field606 = 0;
					Client.field735 = var0;
					Client.field487 = var1;
					var11 = class331.method6337(class287.field3163, Client.field753.field1385);
					var11.field3212.method8698(var3);
					var11.field3212.method8805(Client.field722.method4076(82) ? 1 : 0);
					Client.field753.method2735(var11);
				}
			}

			if (var2 == 1) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3142, Client.field753.field1385);
				var13.field3212.method8698(var3);
				var13.field3212.method8645(Client.field3365);
				var13.field3212.method8642(Client.field2985);
				var13.field3212.method8698(var0 + Client.field2850);
				var13.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				var13.field3212.method8698(Client.field1678);
				var13.field3212.method8859(var1 + Client.field2841);
				Client.field753.method2735(var13);
			}

			if (var2 == 17) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3124, Client.field753.field1385);
				var13.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				var13.field3212.method8645(Client.field2805);
				var13.field3212.method8859(Client.field658);
				var13.field3212.method8642(var3);
				var13.field3212.method8734(Client.field2850 + var0);
				var13.field3212.method8698(var1 + Client.field2841);
				var13.field3212.method8698(Client.field600);
				Client.field753.method2735(var13);
			}

			if (var2 == 21) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3122, Client.field753.field1385);
				var13.field3212.method8698(Client.field2850 + var0);
				var13.field3212.method8688(Client.field722.method4076(82) ? 1 : 0);
				var13.field3212.method8859(Client.field2841 + var1);
				var13.field3212.method8734(var3);
				Client.field753.method2735(var13);
			}

			if (var2 == 29) {
				var13 = class331.method6337(class287.field3132, Client.field753.field1385);
				var13.field3212.method8644(var1);
				Client.field753.method2735(var13);
				var14 = class166.method3349(var1);
				if (null != var14 && var14.field3695 != null && 5 == var14.field3695[0][0]) {
					var12 = var14.field3695[0][1];
					if (var14.field3697[0] != class307.field3482[var12]) {
						class307.field3482[var12] = var14.field3697[0];
						class8.method54(var12);
					}
				}
			}

			if (var2 == 22) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				Client.field735 = var0;
				Client.field487 = var1;
				var13 = class331.method6337(class287.field3118, Client.field753.field1385);
				var13.field3212.method8734(Client.field2841 + var1);
				var13.field3212.method8716(Client.field722.method4076(82) ? 1 : 0);
				var13.field3212.method8642(var0 + Client.field2850);
				var13.field3212.method8734(var3);
				Client.field753.method2735(var13);
			}

			if (var2 == 1004) {
				Client.field515 = var7;
				Client.field676 = var8;
				Client.field607 = 2;
				Client.field606 = 0;
				var13 = class331.method6337(class287.field3177, Client.field753.field1385);
				var13.field3212.method8642(Client.field2841 + var1);
				var13.field3212.method8734(var3);
				var13.field3212.method8734(Client.field2850 + var0);
				Client.field753.method2735(var13);
			}

			if (0 != Client.field649) {
				Client.field649 = 0;
				Client.method3176(class166.method3349(Client.field3365));
			}

			if (Client.field651) {
				Client.method3392();
			}

		}
	}
}
