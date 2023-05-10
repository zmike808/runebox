import java.io.IOException;

public class class206 implements class30 {
	boolean field2335;
	boolean field2337;
	class317 field2340;

	public class206() {
		this.field2340 = null;
		this.field2335 = false;
		this.field2337 = false;
	}

	public void method4049(class317 var1) {
		this.method4051();
		if (null != var1) {
			this.field2340 = var1;
			class313 var3 = var1.method6155();
			if (var3 != null) {
				var3.field3503.method5847(true);
				if (null != var3.field3501) {
					class84 var4 = new class84();
					var4.method2200(var1);
					var4.method2198(var3.field3501);
					Client.method6594().method6711(var4);
				}
			}
		}

	}

	public class317 method4060() {
		return this.field2340;
	}

	public void method4051() {
		if (this.field2340 != null) {
			class313 var2 = this.field2340.method6155();
			class317 var3 = this.field2340;
			this.field2340 = null;
			if (var2 != null) {
				var2.field3503.method5847(false);
				if (null != var2.field3501) {
					class84 var4 = new class84();
					var4.method2200(var3);
					var4.method2198(var2.field3501);
					Client.method6594().method6711(var4);
				}

			}
		}
	}

	public boolean method463(int var1) {
		if (null == this.field2340) {
			return false;
		} else {
			class28 var3 = this.field2340.method6127();
			if (var3 == null) {
				return false;
			} else {
				if (var3.method414(var1)) {
					switch(var1) {
					case 81:
						this.field2337 = true;
						break;
					case 82:
						this.field2335 = true;
						break;
					default:
						if (this.method4057(var1)) {
							Client.method3176(this.field2340);
						}
					}
				}

				return var3.method412(var1);
			}
		}
	}

	public boolean method456(int var1) {
		switch(var1) {
		case 81:
			this.field2337 = false;
			return false;
		case 82:
			this.field2335 = false;
			return false;
		default:
			return false;
		}
	}

	public boolean method455(char var1) {
		if (this.field2340 == null) {
			return false;
		} else if (!class36.method715(var1)) {
			return false;
		} else {
			class315 var3 = this.field2340.method6152();
			if (var3 != null && var3.method5903()) {
				class28 var4 = this.field2340.method6127();
				if (null == var4) {
					return false;
				} else {
					if (var4.method442(var1) && var3.method5864(var1)) {
						Client.method3176(this.field2340);
					}

					return var4.method413(var1);
				}
			} else {
				return false;
			}
		}
	}

	public boolean method458(boolean var1) {
		return false;
	}

	boolean method4057(int var1) {
		if (this.field2340 == null) {
			return false;
		} else {
			class315 var3 = this.field2340.method6152();
			if (var3 != null && var3.method5903()) {
				switch(var1) {
				case 13:
					this.method4051();
					return true;
				case 48:
					if (this.field2335) {
						var3.method6112();
					}

					return true;
				case 65:
					if (this.field2335) {
						var3.method6033(Client.method3170());
					}

					return true;
				case 66:
					if (this.field2335) {
						var3.method5888(Client.method3170());
					}

					return true;
				case 67:
					if (this.field2335) {
						var3.method5890(Client.method3170());
					}

					return true;
				case 84:
					if (var3.method5909() == 0) {
						var3.method5864(10);
					} else if (this.field2337 && var3.method5913()) {
						var3.method5864(10);
					} else {
						class313 var4 = this.field2340.method6155();
						class84 var5 = new class84();
						var5.method2200(this.field2340);
						var5.method2198(var4.field3505);
						Client.method6594().method6711(var5);
						this.method4051();
					}

					return true;
				case 85:
					if (this.field2335) {
						var3.method6050();
					} else {
						var3.method5967();
					}

					return true;
				case 96:
					if (this.field2335) {
						var3.method6111(this.field2337);
					} else {
						var3.method5876(this.field2337);
					}

					return true;
				case 97:
					if (this.field2335) {
						var3.method5879(this.field2337);
					} else {
						var3.method5877(this.field2337);
					}

					return true;
				case 98:
					if (this.field2335) {
						var3.method6034();
					} else {
						var3.method5880(this.field2337);
					}

					return true;
				case 99:
					if (this.field2335) {
						var3.method6038();
					} else {
						var3.method5881(this.field2337);
					}

					return true;
				case 101:
					if (this.field2335) {
						var3.method6102();
					} else {
						var3.method5927();
					}

					return true;
				case 102:
					if (this.field2335) {
						var3.method5874(this.field2337);
					} else {
						var3.method5868(this.field2337);
					}

					return true;
				case 103:
					if (this.field2335) {
						var3.method5982(this.field2337);
					} else {
						var3.method5977(this.field2337);
					}

					return true;
				case 104:
					if (this.field2335) {
						var3.method5884(this.field2337);
					} else {
						var3.method5882(this.field2337);
					}

					return true;
				case 105:
					if (this.field2335) {
						var3.method5870(this.field2337);
					} else {
						var3.method5867(this.field2337);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	static class94 method4062() {
		class471 var1 = null;
		class94 var2 = new class94();

		try {
			var1 = class219.method4296("", Client.field491.field3813, false);
			byte[] var3 = new byte[(int)var1.method8422()];

			int var5;
			for (int var4 = 0; var4 < var3.length; var4 += var5) {
				var5 = var1.method8423(var3, var4, var3.length - var4);
				if (var5 == -1) {
					throw new IOException();
				}
			}

			var2 = new class94(new class489(var3));
		} catch (Exception var7) {
		}

		try {
			if (null != var1) {
				var1.method8417();
			}
		} catch (Exception var6) {
		}

		return var2;
	}
}
