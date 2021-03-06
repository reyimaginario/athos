package com.hexsoft.athos.test.mmpi2.constantes;

import java.util.HashMap;

public class ConstantesEscalaBasica {
	
	public static final String BASICAS = "Basicas";
	public static final String PB = "PB";
	public static final String PTM = "PTM";
	public static final String PTF = "PTF";
	
	public static final String SUBESCALA_L = "SUBESCALA_L";
	public static final Integer[] L_RESPUESTAS_T = 	new Integer[] {};
	public static final Integer[] L_RESPUESTAS_F = 	new Integer[] {16, 29, 41, 51, 77, 93, 102, 107, 123, 139, 153, 183, 203, 232, 260};
	public static final HashMap<Integer, Integer> L_MASCULINA = new HashMap<>();
	static {
		L_MASCULINA.put(0, 35);
		L_MASCULINA.put(1, 39);
		L_MASCULINA.put(2, 43);
		L_MASCULINA.put(3, 48);
		L_MASCULINA.put(4, 52);
		L_MASCULINA.put(5, 56);
		L_MASCULINA.put(6, 61);
		L_MASCULINA.put(7, 65);
		L_MASCULINA.put(8, 70);
		L_MASCULINA.put(9, 74);
		L_MASCULINA.put(10, 78);
		L_MASCULINA.put(11, 83);
		L_MASCULINA.put(12, 87);
		L_MASCULINA.put(13, 91);
		L_MASCULINA.put(14, 96);
		L_MASCULINA.put(15, 100);
	}
	public static final HashMap<Integer, Integer> L_FEMENINA = new HashMap<>();
	static {
		L_FEMENINA.put(0, 33);
		L_FEMENINA.put(1, 38);
		L_FEMENINA.put(2, 43);
		L_FEMENINA.put(3, 47);
		L_FEMENINA.put(4, 52);
		L_FEMENINA.put(5, 57);
		L_FEMENINA.put(6, 62);
		L_FEMENINA.put(7, 66);
		L_FEMENINA.put(8, 71);
		L_FEMENINA.put(9, 76);
		L_FEMENINA.put(10, 81);
		L_FEMENINA.put(11, 86);
		L_FEMENINA.put(12, 90);
		L_FEMENINA.put(13, 95);
		L_FEMENINA.put(14, 100);
		L_FEMENINA.put(15, 105);
	}
	
	public static final String SUBESCALA_F = "SUBESCALA_F";
	public static final Integer[] F_RESPUESTAS_T = 	new Integer[] {18, 24, 30, 36, 42, 48, 54, 60, 66, 72, 84, 96, 114, 138, 144, 150, 156, 162, 168, 180, 198, 216, 228, 234, 240, 246, 252, 258, 264, 270, 282, 288, 294, 300, 306, 312, 324, 336, 349, 355, 361};
	public static final Integer[] F_RESPUESTAS_F = 	new Integer[] {6, 12, 78, 90, 102, 108, 120, 126, 132, 174, 186, 192, 204, 210, 222, 276,318, 330, 343};
	public static final HashMap<Integer, Integer> F_MASCULINA = new HashMap<>();
	static {
		F_MASCULINA.put(0, 36);
		F_MASCULINA.put(1, 39);
		F_MASCULINA.put(2, 42);
		F_MASCULINA.put(3, 45);
		F_MASCULINA.put(4, 48);
		F_MASCULINA.put(5, 51);
		F_MASCULINA.put(6, 55);
		F_MASCULINA.put(7, 58);
		F_MASCULINA.put(8, 62);
		F_MASCULINA.put(9, 64);
		F_MASCULINA.put(10, 67);
		F_MASCULINA.put(11, 71);
		F_MASCULINA.put(12, 73);
		F_MASCULINA.put(13, 76);
		F_MASCULINA.put(14, 79);
		F_MASCULINA.put(15, 82);
		F_MASCULINA.put(16, 85);
		F_MASCULINA.put(17, 89);
		F_MASCULINA.put(18, 92);
		F_MASCULINA.put(19, 95);
		F_MASCULINA.put(20, 98);
		F_MASCULINA.put(21, 101);
		F_MASCULINA.put(22, 104);
		F_MASCULINA.put(23, 107);
		F_MASCULINA.put(24, 110);
		F_MASCULINA.put(25, 113);
		F_MASCULINA.put(26, 116);
		F_MASCULINA.put(27, 119);
		F_MASCULINA.put(28, 120);
	}
	public static final HashMap<Integer, Integer> F_FEMENINA = new HashMap<>();
	static {
		F_FEMENINA.put(0, 37);
		F_FEMENINA.put(1, 41);
		F_FEMENINA.put(2, 44);
		F_FEMENINA.put(3, 48);
		F_FEMENINA.put(4, 51);
		F_FEMENINA.put(5, 55);
		F_FEMENINA.put(6, 58);
		F_FEMENINA.put(7, 61);
		F_FEMENINA.put(8, 65);
		F_FEMENINA.put(9, 68);
		F_FEMENINA.put(10, 72);
		F_FEMENINA.put(11, 75);
		F_FEMENINA.put(12, 79);
		F_FEMENINA.put(13, 82);
		F_FEMENINA.put(14, 85);
		F_FEMENINA.put(15, 89);
		F_FEMENINA.put(16, 92);
		F_FEMENINA.put(17, 96);
		F_FEMENINA.put(18, 99);
		F_FEMENINA.put(19, 100);
		F_FEMENINA.put(20, 106);
		F_FEMENINA.put(21, 109);
		F_FEMENINA.put(22, 113);
		F_FEMENINA.put(23, 116);
	}
	
	public static final String SUBESCALA_K = "SUBESCALA_K";
	public static final Integer[] K_RESPUESTAS_T = 	new Integer[] {83};
	public static final Integer[] K_RESPUESTAS_F = 	new Integer[] {29, 37, 58, 76, 110, 116, 122, 127, 130, 136, 148, 157, 158, 167, 171, 196, 213, 243, 267, 284, 290, 330, 338, 339, 341, 346, 348, 356, 365};
	public static final HashMap<Integer, Integer> K_MASCULINA = new HashMap<>();
	static {
		K_MASCULINA.put(6, 30);
		K_MASCULINA.put(7, 33);
		K_MASCULINA.put(8, 35);
		K_MASCULINA.put(9, 37);
		K_MASCULINA.put(10, 39);
		K_MASCULINA.put(11, 41);
		K_MASCULINA.put(12, 43);
		K_MASCULINA.put(13, 45);
		K_MASCULINA.put(14, 47);
		K_MASCULINA.put(15, 49);
		K_MASCULINA.put(16, 51);
		K_MASCULINA.put(17, 54);
		K_MASCULINA.put(18, 56);
		K_MASCULINA.put(19, 58);
		K_MASCULINA.put(20, 60);
		K_MASCULINA.put(21, 62);
		K_MASCULINA.put(22, 64);
		K_MASCULINA.put(23, 66);
		K_MASCULINA.put(24, 68);
		K_MASCULINA.put(25, 70);
		K_MASCULINA.put(26, 72);
		K_MASCULINA.put(27, 75);
		K_MASCULINA.put(28, 77);
		K_MASCULINA.put(29, 79);
		K_MASCULINA.put(30, 81);
	}
	public static final HashMap<Integer, Integer> K_FEMENINA = new HashMap<>();
	static {
		K_FEMENINA.put(30,83);
		K_FEMENINA.put(29,81);
		K_FEMENINA.put(28,78);
		K_FEMENINA.put(27,76);
		K_FEMENINA.put(26,74);
		K_FEMENINA.put(25,72);
		K_FEMENINA.put(24,70);
		K_FEMENINA.put(23,67);
		K_FEMENINA.put(22,65);
		K_FEMENINA.put(21,63);
		K_FEMENINA.put(20,61);
		K_FEMENINA.put(19,59);
		K_FEMENINA.put(18,56);
		K_FEMENINA.put(17,54);
		K_FEMENINA.put(16,52);
		K_FEMENINA.put(15,50);
		K_FEMENINA.put(14,48);
		K_FEMENINA.put(13,46);
		K_FEMENINA.put(12,43);
		K_FEMENINA.put(11,41);
		K_FEMENINA.put(10,39);
		K_FEMENINA.put(9,37);
		K_FEMENINA.put(8,35);
		K_FEMENINA.put(7,32);
		K_FEMENINA.put(6,30);
	}
	
	public static final String SUBESCALA_HS = "SUBESCALA_HS";
	public static final Integer[] HS_RESPUESTAS_T = 	new Integer[] {18, 28, 39, 53, 59, 97, 101, 111, 149, 175, 247};
	public static final Integer[] HS_RESPUESTAS_F = 	new Integer[] {2, 3, 8, 10, 20, 45, 47, 57, 91, 117, 141, 143, 152, 164, 173, 176, 179, 208, 224, 249, 255 };
	public static final HashMap<Integer, Integer> HS_MASCULINA = new HashMap<>();
	static {
		HS_MASCULINA.put(44,120);
		HS_MASCULINA.put(43,119);
		HS_MASCULINA.put(42,116);
		HS_MASCULINA.put(41,114);
		HS_MASCULINA.put(40,112);
		HS_MASCULINA.put(39,110);
		HS_MASCULINA.put(38,108);
		HS_MASCULINA.put(37,105);
		HS_MASCULINA.put(36,103);
		HS_MASCULINA.put(35,101);
		HS_MASCULINA.put(34,99);
		HS_MASCULINA.put(33,97);
		HS_MASCULINA.put(32,94);
		HS_MASCULINA.put(31,92);
		HS_MASCULINA.put(30,90);
		HS_MASCULINA.put(29,88);
		HS_MASCULINA.put(28,86);
		HS_MASCULINA.put(27,84);
		HS_MASCULINA.put(26,81);
		HS_MASCULINA.put(25,79);
		HS_MASCULINA.put(24,77);
		HS_MASCULINA.put(23,75);
		HS_MASCULINA.put(22,73);
		HS_MASCULINA.put(21,70);
		HS_MASCULINA.put(20,68);
		HS_MASCULINA.put(19,66);
		HS_MASCULINA.put(18,64);
		HS_MASCULINA.put(17,62);
		HS_MASCULINA.put(16,59);
		HS_MASCULINA.put(15,57);
		HS_MASCULINA.put(14,54);
		HS_MASCULINA.put(13,51);
		HS_MASCULINA.put(12,48);
		HS_MASCULINA.put(11,45);
		HS_MASCULINA.put(10,42);
		HS_MASCULINA.put(9,39);
		HS_MASCULINA.put(8,37);
		HS_MASCULINA.put(7,35);
		HS_MASCULINA.put(6,33);
		HS_MASCULINA.put(5,32);
		HS_MASCULINA.put(4,31);
		HS_MASCULINA.put(3,30);
	}
	public static final HashMap<Integer, Integer> HS_FEMENINA = new HashMap<>();
	static {
		HS_FEMENINA.put(46,120);
		HS_FEMENINA.put(45,118);
		HS_FEMENINA.put(44,116);
		HS_FEMENINA.put(43,113);
		HS_FEMENINA.put(42,111);
		HS_FEMENINA.put(41,109);
		HS_FEMENINA.put(40,107);
		HS_FEMENINA.put(39,105);
		HS_FEMENINA.put(38,103);
		HS_FEMENINA.put(37,101);
		HS_FEMENINA.put(36,99);
		HS_FEMENINA.put(35,97);
		HS_FEMENINA.put(34,95);
		HS_FEMENINA.put(33,92);
		HS_FEMENINA.put(32,90);
		HS_FEMENINA.put(31,88);
		HS_FEMENINA.put(30,86);
		HS_FEMENINA.put(29,84);
		HS_FEMENINA.put(28,82);
		HS_FEMENINA.put(27,80);
		HS_FEMENINA.put(26,78);
		HS_FEMENINA.put(25,76);
		HS_FEMENINA.put(24,74);
		HS_FEMENINA.put(23,71);
		HS_FEMENINA.put(22,69);
		HS_FEMENINA.put(21,67);
		HS_FEMENINA.put(20,65);
		HS_FEMENINA.put(19,63);
		HS_FEMENINA.put(18,61);
		HS_FEMENINA.put(17,59);
		HS_FEMENINA.put(16,57);
		HS_FEMENINA.put(15,54);
		HS_FEMENINA.put(14,51);
		HS_FEMENINA.put(13,49);
		HS_FEMENINA.put(12,46);
		HS_FEMENINA.put(11,43);
		HS_FEMENINA.put(10,40);
		HS_FEMENINA.put(9,38);
		HS_FEMENINA.put(8,35);
		HS_FEMENINA.put(7,33);
		HS_FEMENINA.put(6,30);
	}
	
	public static final String SUBESCALA_D = "SUBESCALA_D";
	public static final Integer[] D_RESPUESTAS_T =		new Integer[] {5, 15, 18, 31, 38, 39, 46, 56, 73, 92, 117, 127, 130, 146, 147, 170, 175, 181, 215, 233};
	public static final Integer[] D_RESPUESTAS_F = 	new Integer[] {2, 9, 10, 20, 29, 33, 37, 43, 45, 49, 55, 68, 75, 76, 95, 109, 118, 134, 140, 141, 142, 143, 148, 165, 178, 188, 189, 212, 221, 223, 226, 238, 245, 248, 260, 267, 330};
	public static final HashMap<Integer, Integer> D_MASCULINA = new HashMap<>();
	static {
		D_MASCULINA.put(55,120);
		D_MASCULINA.put(54,119);
		D_MASCULINA.put(53,117);
		D_MASCULINA.put(52,115);
		D_MASCULINA.put(51,114);
		D_MASCULINA.put(50,112);
		D_MASCULINA.put(49,110);
		D_MASCULINA.put(48,108);
		D_MASCULINA.put(47,106);
		D_MASCULINA.put(46,104);
		D_MASCULINA.put(45,102);
		D_MASCULINA.put(44,100);
		D_MASCULINA.put(43,98);
		D_MASCULINA.put(42,97);
		D_MASCULINA.put(41,95);
		D_MASCULINA.put(40,93);
		D_MASCULINA.put(39,91);
		D_MASCULINA.put(38,89);
		D_MASCULINA.put(37,87);
		D_MASCULINA.put(36,85);
		D_MASCULINA.put(35,83);
		D_MASCULINA.put(34,81);
		D_MASCULINA.put(33,80);
		D_MASCULINA.put(32,78);
		D_MASCULINA.put(31,76);
		D_MASCULINA.put(30,74);
		D_MASCULINA.put(29,72);
		D_MASCULINA.put(28,70);
		D_MASCULINA.put(27,68);
		D_MASCULINA.put(26,66);
		D_MASCULINA.put(25,64);
		D_MASCULINA.put(24,62);
		D_MASCULINA.put(23,61);
		D_MASCULINA.put(22,59);
		D_MASCULINA.put(21,57);
		D_MASCULINA.put(20,54);
		D_MASCULINA.put(19,52);
		D_MASCULINA.put(18,50);
		D_MASCULINA.put(17,47);
		D_MASCULINA.put(16,45);
		D_MASCULINA.put(15,42);
		D_MASCULINA.put(14,40);
		D_MASCULINA.put(13,38);
		D_MASCULINA.put(12,36);
		D_MASCULINA.put(11,34);
		D_MASCULINA.put(10,32);
		D_MASCULINA.put(9,30);
	}
	public static final HashMap<Integer, Integer> D_FEMENINA = new HashMap<>();
	static {
		D_FEMENINA.put(53,120);
		D_FEMENINA.put(52,118);
		D_FEMENINA.put(51,116);
		D_FEMENINA.put(50,114);
		D_FEMENINA.put(49,112);
		D_FEMENINA.put(48,109);
		D_FEMENINA.put(47,107);
		D_FEMENINA.put(46,105);
		D_FEMENINA.put(45,103);
		D_FEMENINA.put(44,101);
		D_FEMENINA.put(43,99);
		D_FEMENINA.put(42,96);
		D_FEMENINA.put(41,94);
		D_FEMENINA.put(40,92);
		D_FEMENINA.put(39,90);
		D_FEMENINA.put(38,88);
		D_FEMENINA.put(37,86);
		D_FEMENINA.put(36,83);
		D_FEMENINA.put(35,81);
		D_FEMENINA.put(34,79);
		D_FEMENINA.put(33,77);
		D_FEMENINA.put(32,75);
		D_FEMENINA.put(31,72);
		D_FEMENINA.put(30,70);
		D_FEMENINA.put(29,68);
		D_FEMENINA.put(28,66);
		D_FEMENINA.put(27,64);
		D_FEMENINA.put(26,62);
		D_FEMENINA.put(25,59);
		D_FEMENINA.put(24,57);
		D_FEMENINA.put(23,55);
		D_FEMENINA.put(22,53);
		D_FEMENINA.put(21,51);
		D_FEMENINA.put(20,49);
		D_FEMENINA.put(19,47);
		D_FEMENINA.put(18,46);
		D_FEMENINA.put(17,44);
		D_FEMENINA.put(16,42);
		D_FEMENINA.put(15,40);
		D_FEMENINA.put(14,38);
		D_FEMENINA.put(13,36);
		D_FEMENINA.put(12,34);
		D_FEMENINA.put(11,32);
		D_FEMENINA.put(10,30);
	}
	
	public static final String SUBESCALA_HY = "SUBESCALA_HY";
	public static final Integer[] HY_RESPUESTAS_T = 	new Integer[] {11, 18, 31, 39, 40, 44, 65, 101, 166, 172, 175, 218, 230};
	public static final Integer[] HY_RESPUESTAS_F = 	new Integer[] {2, 3, 7, 8, 9, 10, 14, 26, 29, 45, 47, 58, 76, 81, 91, 95, 98, 110, 115, 116, 124, 125, 129, 135, 141, 148, 151, 152, 157, 159, 161, 164, 167, 173, 176, 179, 185, 193, 208, 213, 224, 241, 243, 249, 253, 263, 265};
	public static final HashMap<Integer, Integer> HY_MASCULINA = new HashMap<>();
	static {
		HY_MASCULINA.put(50,120);
		HY_MASCULINA.put(49,119);
		HY_MASCULINA.put(48,116);
		HY_MASCULINA.put(47,114);
		HY_MASCULINA.put(46,111);
		HY_MASCULINA.put(45,109);
		HY_MASCULINA.put(44,106);
		HY_MASCULINA.put(43,104);
		HY_MASCULINA.put(42,101);
		HY_MASCULINA.put(41,99);
		HY_MASCULINA.put(40,97);
		HY_MASCULINA.put(39,94);
		HY_MASCULINA.put(38,91);
		HY_MASCULINA.put(37,89);
		HY_MASCULINA.put(36,86);
		HY_MASCULINA.put(35,84);
		HY_MASCULINA.put(34,81);
		HY_MASCULINA.put(33,79);
		HY_MASCULINA.put(32,76);
		HY_MASCULINA.put(31,74);
		HY_MASCULINA.put(30,71);
		HY_MASCULINA.put(29,69);
		HY_MASCULINA.put(28,66);
		HY_MASCULINA.put(27,64);
		HY_MASCULINA.put(26,61);
		HY_MASCULINA.put(25,59);
		HY_MASCULINA.put(24,57);
		HY_MASCULINA.put(23,54);
		HY_MASCULINA.put(22,52);
		HY_MASCULINA.put(21,50);
		HY_MASCULINA.put(20,47);
		HY_MASCULINA.put(19,45);
		HY_MASCULINA.put(18,43);
		HY_MASCULINA.put(17,42);
		HY_MASCULINA.put(16,40);
		HY_MASCULINA.put(15,38);
		HY_MASCULINA.put(14,37);
		HY_MASCULINA.put(13,35);
		HY_MASCULINA.put(12,34);
		HY_MASCULINA.put(11,33);
		HY_MASCULINA.put(10,32);
		HY_MASCULINA.put(9,31);
		HY_MASCULINA.put(8,30);
	}
	public static final HashMap<Integer, Integer> HY_FEMENINA = new HashMap<>();
	static {
		HY_FEMENINA.put(52,120);
		HY_FEMENINA.put(51,118);
		HY_FEMENINA.put(50,115);
		HY_FEMENINA.put(49,113);
		HY_FEMENINA.put(48,111);
		HY_FEMENINA.put(47,108);
		HY_FEMENINA.put(46,106);
		HY_FEMENINA.put(45,104);
		HY_FEMENINA.put(44,101);
		HY_FEMENINA.put(43,99);
		HY_FEMENINA.put(42,96);
		HY_FEMENINA.put(41,94);
		HY_FEMENINA.put(40,92);
		HY_FEMENINA.put(39,89);
		HY_FEMENINA.put(38,87);
		HY_FEMENINA.put(37,84);
		HY_FEMENINA.put(36,82);
		HY_FEMENINA.put(35,80);
		HY_FEMENINA.put(34,77);
		HY_FEMENINA.put(33,75);
		HY_FEMENINA.put(32,73);
		HY_FEMENINA.put(31,70);
		HY_FEMENINA.put(30,68);
		HY_FEMENINA.put(29,65);
		HY_FEMENINA.put(28,63);
		HY_FEMENINA.put(27,61);
		HY_FEMENINA.put(26,58);
		HY_FEMENINA.put(25,56);
		HY_FEMENINA.put(24,54);
		HY_FEMENINA.put(23,51);
		HY_FEMENINA.put(22,49);
		HY_FEMENINA.put(21,47);
		HY_FEMENINA.put(20,45);
		HY_FEMENINA.put(19,43);
		HY_FEMENINA.put(18,41);
		HY_FEMENINA.put(17,39);
		HY_FEMENINA.put(16,38);
		HY_FEMENINA.put(15,36);
		HY_FEMENINA.put(14,35);
		HY_FEMENINA.put(13,34);
		HY_FEMENINA.put(11,32);
		HY_FEMENINA.put(10,31);
	}
	
	public static final String SUBESCALA_PD = "SUBESCALA_PD";
	public static final Integer[] PD_RESPUESTAS_T = 	new Integer[] {17, 21, 22, 31, 32, 35, 42, 52, 54, 56, 71, 82, 89, 94, 99, 105, 113, 195, 202, 219, 225, 259, 264, 288};
	public static final Integer[] PD_RESPUESTAS_F = 	new Integer[] {9, 12, 34, 70, 79, 83, 95, 122, 125, 129, 143, 157, 158, 160, 167, 171, 185, 209, 214, 217, 226, 243, 261, 263, 266, 267};
	public static final HashMap<Integer, Integer> PD_MASCULINA = new HashMap<>();
	static {
		PD_MASCULINA.put(51,120);
		PD_MASCULINA.put(50,117);
		PD_MASCULINA.put(49,115);
		PD_MASCULINA.put(48,112);
		PD_MASCULINA.put(47,110);
		PD_MASCULINA.put(46,107);
		PD_MASCULINA.put(45,105);
		PD_MASCULINA.put(44,102);
		PD_MASCULINA.put(43,100);
		PD_MASCULINA.put(42,97);
		PD_MASCULINA.put(41,95);
		PD_MASCULINA.put(40,92);
		PD_MASCULINA.put(39,90);
		PD_MASCULINA.put(38,87);
		PD_MASCULINA.put(37,84);
		PD_MASCULINA.put(36,82);
		PD_MASCULINA.put(35,79);
		PD_MASCULINA.put(34,77);
		PD_MASCULINA.put(33,74);
		PD_MASCULINA.put(32,72);
		PD_MASCULINA.put(31,69);
		PD_MASCULINA.put(30,67);
		PD_MASCULINA.put(29,64);
		PD_MASCULINA.put(28,62);
		PD_MASCULINA.put(27,59);
		PD_MASCULINA.put(26,57);
		PD_MASCULINA.put(25,54);
		PD_MASCULINA.put(24,52);
		PD_MASCULINA.put(23,50);
		PD_MASCULINA.put(22,48);
		PD_MASCULINA.put(21,46);
		PD_MASCULINA.put(20,44);
		PD_MASCULINA.put(19,42);
		PD_MASCULINA.put(18,40);
		PD_MASCULINA.put(17,39);
		PD_MASCULINA.put(16,37);
		PD_MASCULINA.put(15,35);
		PD_MASCULINA.put(14,34);
		PD_MASCULINA.put(13,33);
		PD_MASCULINA.put(12,31);
		PD_MASCULINA.put(11,30);
	}
	public static final HashMap<Integer, Integer> PD_FEMENINA = new HashMap<>();
	static {
		PD_FEMENINA.put(50,120);
		PD_FEMENINA.put(49,118);
		PD_FEMENINA.put(48,115);
		PD_FEMENINA.put(47,113);
		PD_FEMENINA.put(46,110);
		PD_FEMENINA.put(45,107);
		PD_FEMENINA.put(44,105);
		PD_FEMENINA.put(43,102);
		PD_FEMENINA.put(42,100);
		PD_FEMENINA.put(41,97);
		PD_FEMENINA.put(40,94);
		PD_FEMENINA.put(39,92);
		PD_FEMENINA.put(38,89);
		PD_FEMENINA.put(37,87);
		PD_FEMENINA.put(36,84);
		PD_FEMENINA.put(35,81);
		PD_FEMENINA.put(34,79);
		PD_FEMENINA.put(33,76);
		PD_FEMENINA.put(32,73);
		PD_FEMENINA.put(31,71);
		PD_FEMENINA.put(30,68);
		PD_FEMENINA.put(29,66);
		PD_FEMENINA.put(28,63);
		PD_FEMENINA.put(27,60);
		PD_FEMENINA.put(26,58);
		PD_FEMENINA.put(25,55);
		PD_FEMENINA.put(24,53);
		PD_FEMENINA.put(23,51);
		PD_FEMENINA.put(22,49);
		PD_FEMENINA.put(21,47);
		PD_FEMENINA.put(20,45);
		PD_FEMENINA.put(19,43);
		PD_FEMENINA.put(18,41);
		PD_FEMENINA.put(17,39);
		PD_FEMENINA.put(16,37);
		PD_FEMENINA.put(15,36);
		PD_FEMENINA.put(14,34);
		PD_FEMENINA.put(13,32);
		PD_FEMENINA.put(12,30);
	}

	public static final String SUBESCALA_MF_M = "SUBESCALA_MF_M";
	public static final Integer[] MF_M_RESPUESTAS_T = 	new Integer[] {4, 25, 62, 64, 67, 74, 80, 112, 119, 122, 128, 137, 166, 177, 187, 191, 196, 205, 209, 219, 236, 251, 256, 268, 271};
	public static final Integer[] MF_M_RESPUESTAS_F = 	new Integer[] {1, 19, 26, 27, 63, 68, 69, 76, 86, 103, 104, 107, 120, 121, 132, 133, 163, 184, 193, 194, 197, 199, 201, 207, 231, 235, 237, 239, 254, 257, 272};
	public static final HashMap<Integer, Integer> MF_M_MASCULINA = new HashMap<>();
	static {
		MF_M_MASCULINA.put(56,109);
		MF_M_MASCULINA.put(55,107);
		MF_M_MASCULINA.put(54,105);
		MF_M_MASCULINA.put(53,103);
		MF_M_MASCULINA.put(52,101);
		MF_M_MASCULINA.put(51,99);
		MF_M_MASCULINA.put(50,97);
		MF_M_MASCULINA.put(49,95);
		MF_M_MASCULINA.put(48,93);
		MF_M_MASCULINA.put(47,91);
		MF_M_MASCULINA.put(46,89);
		MF_M_MASCULINA.put(45,87);
		MF_M_MASCULINA.put(44,85);
		MF_M_MASCULINA.put(43,83);
		MF_M_MASCULINA.put(42,81);
		MF_M_MASCULINA.put(41,79);
		MF_M_MASCULINA.put(40,78);
		MF_M_MASCULINA.put(39,76);
		MF_M_MASCULINA.put(38,74);
		MF_M_MASCULINA.put(37,72);
		MF_M_MASCULINA.put(36,70);
		MF_M_MASCULINA.put(35,68);
		MF_M_MASCULINA.put(34,66);
		MF_M_MASCULINA.put(33,64);
		MF_M_MASCULINA.put(32,62);
		MF_M_MASCULINA.put(31,60);
		MF_M_MASCULINA.put(30,58);
		MF_M_MASCULINA.put(29,56);
		MF_M_MASCULINA.put(28,54);
		MF_M_MASCULINA.put(27,52);
		MF_M_MASCULINA.put(26,50);
		MF_M_MASCULINA.put(25,48);
		MF_M_MASCULINA.put(24,46);
		MF_M_MASCULINA.put(23,44);
		MF_M_MASCULINA.put(22,42);
		MF_M_MASCULINA.put(21,40);
		MF_M_MASCULINA.put(20,38);
		MF_M_MASCULINA.put(19,36);
		MF_M_MASCULINA.put(18,34);
		MF_M_MASCULINA.put(17,32);
		MF_M_MASCULINA.put(16,30);
	}
	public static final HashMap<Integer, Integer> MF_M_FEMENINA = new HashMap<>();
	
	public static final String SUBESCALA_MF_F = "SUBESCALA_MF_F";
	public static final Integer[] MF_F_RESPUESTAS_T = 	new Integer[] {4, 25, 62, 64, 67, 74, 80, 112, 119, 121, 122, 128, 137, 177, 187, 191, 196, 205, 219, 236, 251, 256, 271};
	public static final Integer[] MF_F_RESPUESTAS_F = 	new Integer[] {1, 19, 26, 27, 63, 68, 69, 76, 86, 103, 104, 107, 120, 132, 133, 163, 166, 184, 193, 194, 197, 199, 201, 207, 209, 231, 235, 237, 239, 254, 257, 268, 272};
	public static final HashMap<Integer, Integer> MF_F_MASCULINA = new HashMap<>();
	public static final HashMap<Integer, Integer> MF_F_FEMENINA = new HashMap<>();
	static {
		MF_F_FEMENINA.put(7,120);
		MF_F_FEMENINA.put(8,118);
		MF_F_FEMENINA.put(9,116);
		MF_F_FEMENINA.put(10,114);
		MF_F_FEMENINA.put(11,111);
		MF_F_FEMENINA.put(12,109);
		MF_F_FEMENINA.put(13,106);
		MF_F_FEMENINA.put(14,104);
		MF_F_FEMENINA.put(15,101);
		MF_F_FEMENINA.put(16,99);
		MF_F_FEMENINA.put(17,96);
		MF_F_FEMENINA.put(18,94);
		MF_F_FEMENINA.put(19,92);
		MF_F_FEMENINA.put(20,89);
		MF_F_FEMENINA.put(21,87);
		MF_F_FEMENINA.put(22,84);
		MF_F_FEMENINA.put(23,82);
		MF_F_FEMENINA.put(24,79);
		MF_F_FEMENINA.put(25,77);
		MF_F_FEMENINA.put(26,74);
		MF_F_FEMENINA.put(27,72);
		MF_F_FEMENINA.put(28,69);
		MF_F_FEMENINA.put(29,67);
		MF_F_FEMENINA.put(30,65);
		MF_F_FEMENINA.put(31,62);
		MF_F_FEMENINA.put(32,60);
		MF_F_FEMENINA.put(33,57);
		MF_F_FEMENINA.put(34,55);
		MF_F_FEMENINA.put(35,52);
		MF_F_FEMENINA.put(36,50);
		MF_F_FEMENINA.put(37,47);
		MF_F_FEMENINA.put(38,45);
		MF_F_FEMENINA.put(39,43);
		MF_F_FEMENINA.put(40,40);
		MF_F_FEMENINA.put(41,38);
		MF_F_FEMENINA.put(42,35);
		MF_F_FEMENINA.put(43,33);
		MF_F_FEMENINA.put(44,30);
	}
	
	public static final String SUBESCALA_PA = "SUBESCALA_PA";
	public static final Integer[] PA_RESPUESTAS_T = 	new Integer[] {16, 17, 22, 23, 24, 42,  99, 113, 138, 144, 145, 146, 162, 234, 259, 271, 277, 285, 305, 307, 333, 334, 336, 355, 361};
	public static final Integer[] PA_RESPUESTAS_F = 	new Integer[] {81, 95, 98, 100, 104, 110, 244, 255, 266, 283, 284, 286, 297, 314, 315};
	public static final HashMap<Integer, Integer> PA_MASCULINA = new HashMap<>();
	static {
		PA_MASCULINA.put(30,120);
		PA_MASCULINA.put(29,119);
		PA_MASCULINA.put(28,116);
		PA_MASCULINA.put(27,112);
		PA_MASCULINA.put(26,108);
		PA_MASCULINA.put(25,105);
		PA_MASCULINA.put(24,101);
		PA_MASCULINA.put(23,97);
		PA_MASCULINA.put(22,94);
		PA_MASCULINA.put(21,90);
		PA_MASCULINA.put(20,86);
		PA_MASCULINA.put(19,83);
		PA_MASCULINA.put(18,79);
		PA_MASCULINA.put(17,75);
		PA_MASCULINA.put(16,72);
		PA_MASCULINA.put(15,68);
		PA_MASCULINA.put(14,64);
		PA_MASCULINA.put(13,61);
		PA_MASCULINA.put(12,57);
		PA_MASCULINA.put(11,53);
		PA_MASCULINA.put(10,49);
		PA_MASCULINA.put(9,46);
		PA_MASCULINA.put(8,42);
		PA_MASCULINA.put(7,39);
		PA_MASCULINA.put(6,37);
		PA_MASCULINA.put(5,34);
		PA_MASCULINA.put(4,32);
		PA_MASCULINA.put(3,31);
		PA_MASCULINA.put(2,30);
	}
	public static final HashMap<Integer, Integer> PA_FEMENINA = new HashMap<>();
	static {
		PA_FEMENINA .put(30,120);
		PA_FEMENINA .put(29,118);
		PA_FEMENINA .put(28,114);
		PA_FEMENINA .put(27,111);
		PA_FEMENINA .put(26,106);
		PA_FEMENINA .put(25,103);
		PA_FEMENINA .put(24,100);
		PA_FEMENINA .put(23,96);
		PA_FEMENINA .put(22,92);
		PA_FEMENINA .put(21,89);
		PA_FEMENINA .put(20,85);
		PA_FEMENINA .put(19,81);
		PA_FEMENINA .put(18,78);
		PA_FEMENINA .put(17,74);
		PA_FEMENINA .put(16,70);
		PA_FEMENINA .put(15,67);
		PA_FEMENINA .put(14,64);
		PA_FEMENINA .put(13,59);
		PA_FEMENINA .put(12,56);
		PA_FEMENINA .put(11,52);
		PA_FEMENINA .put(10,49);
		PA_FEMENINA .put(9,45);
		PA_FEMENINA .put(8,42);
		PA_FEMENINA .put(7,39);
		PA_FEMENINA .put(6,37);
		PA_FEMENINA .put(5,34);
		PA_FEMENINA .put(4,32);
		PA_FEMENINA .put(3,31);
		PA_FEMENINA .put(2,30);
	}
	
	public static final String SUBESCALA_PT = "SUBESCALA_PT";
	public static final Integer[] PT_RESPUESTAS_T = 	new Integer[] {11, 16, 23, 31, 38, 56, 65, 73, 82, 89, 94, 130, 147, 170, 175, 196, 218, 242, 273, 275, 277, 285, 289, 301, 302, 304, 308, 309, 310, 313, 316, 317, 320, 325, 326, 327, 328, 329, 331};
	public static final Integer[] PT_RESPUESTAS_F = 	new Integer[] {3,  9, 33, 109, 140, 165, 174, 293, 321};
	public static final HashMap<Integer, Integer> PT_MASCULINA = new HashMap<>();
	static {
		PT_MASCULINA.put(60,120);
		PT_MASCULINA.put(59,119);
		PT_MASCULINA.put(58,117);
		PT_MASCULINA.put(57,115);
		PT_MASCULINA.put(56,113);
		PT_MASCULINA.put(55,111);
		PT_MASCULINA.put(54,109);
		PT_MASCULINA.put(53,106);
		PT_MASCULINA.put(52,104);
		PT_MASCULINA.put(51,102);
		PT_MASCULINA.put(50,100);
		PT_MASCULINA.put(49,98);
		PT_MASCULINA.put(48,96);
		PT_MASCULINA.put(47,94);
		PT_MASCULINA.put(46,91);
		PT_MASCULINA.put(45,89);
		PT_MASCULINA.put(44,87);
		PT_MASCULINA.put(43,85);
		PT_MASCULINA.put(42,83);
		PT_MASCULINA.put(41,81);
		PT_MASCULINA.put(40,79);
		PT_MASCULINA.put(39,77);
		PT_MASCULINA.put(38,74);
		PT_MASCULINA.put(37,72);
		PT_MASCULINA.put(36,70);
		PT_MASCULINA.put(35,68);
		PT_MASCULINA.put(34,66);
		PT_MASCULINA.put(33,64);
		PT_MASCULINA.put(32,62);
		PT_MASCULINA.put(31,59);
		PT_MASCULINA.put(30,57);
		PT_MASCULINA.put(29,55);
		PT_MASCULINA.put(28,53);
		PT_MASCULINA.put(27,51);
		PT_MASCULINA.put(26,49);
		PT_MASCULINA.put(25,47);
		PT_MASCULINA.put(24,44);
		PT_MASCULINA.put(23,43);
		PT_MASCULINA.put(22,41);
		PT_MASCULINA.put(21,39);
		PT_MASCULINA.put(20,37);
		PT_MASCULINA.put(19,36);
		PT_MASCULINA.put(18,34);
		PT_MASCULINA.put(17,33);
		PT_MASCULINA.put(16,32);
		PT_MASCULINA.put(15,31);
		PT_MASCULINA.put(14,30);
	}
	public static final HashMap<Integer, Integer> PT_FEMENINA = new HashMap<>();
	static {
		PT_FEMENINA.put(66,120);
		PT_FEMENINA.put(65,119);
		PT_FEMENINA.put(64,117);
		PT_FEMENINA.put(63,115);
		PT_FEMENINA.put(62,114);
		PT_FEMENINA.put(61,112);
		PT_FEMENINA.put(60,110);
		PT_FEMENINA.put(59,108);
		PT_FEMENINA.put(58,106);
		PT_FEMENINA.put(57,104);
		PT_FEMENINA.put(56,103);
		PT_FEMENINA.put(55,101);
		PT_FEMENINA.put(54,99);
		PT_FEMENINA.put(53,97);
		PT_FEMENINA.put(52,95);
		PT_FEMENINA.put(51,94);
		PT_FEMENINA.put(50,92);
		PT_FEMENINA.put(49,90);
		PT_FEMENINA.put(48,88);
		PT_FEMENINA.put(47,87);
		PT_FEMENINA.put(46,84);
		PT_FEMENINA.put(45,83);
		PT_FEMENINA.put(44,81);
		PT_FEMENINA.put(43,79);
		PT_FEMENINA.put(42,77);
		PT_FEMENINA.put(41,75);
		PT_FEMENINA.put(40,73);
		PT_FEMENINA.put(39,72);
		PT_FEMENINA.put(38,70);
		PT_FEMENINA.put(37,68);
		PT_FEMENINA.put(36,66);
		PT_FEMENINA.put(35,64);
		PT_FEMENINA.put(34,62);
		PT_FEMENINA.put(33,61);
		PT_FEMENINA.put(32,59);
		PT_FEMENINA.put(31,57);
		PT_FEMENINA.put(30,55);
		PT_FEMENINA.put(29,53);
		PT_FEMENINA.put(28,51);
		PT_FEMENINA.put(27,49);
		PT_FEMENINA.put(26,47);
		PT_FEMENINA.put(25,44);
		PT_FEMENINA.put(24,42);
		PT_FEMENINA.put(23,40);
		PT_FEMENINA.put(22,39);
		PT_FEMENINA.put(21,37);
		PT_FEMENINA.put(20,35);
		PT_FEMENINA.put(19,34);
		PT_FEMENINA.put(18,32);
		PT_FEMENINA.put(17,31);
		PT_FEMENINA.put(16,30);
	}
	
	public static final String SUBESCALA_SC = "SUBESCALA_SC";
	public static final Integer[] SC_RESPUESTAS_T = 	new Integer[] {16, 17, 21, 22, 23, 31, 32, 35, 38, 42, 44, 46, 48, 65, 85, 92, 138, 145, 147, 166, 168, 170, 180, 182, 190, 218, 221, 229, 233, 234, 242, 247, 252, 256, 268, 273, 274, 277, 279, 281, 287, 291, 292, 296, 298, 299, 303, 307, 311, 316, 319, 320, 322, 323, 325, 329, 332, 333, 355};
	public static final Integer[] SC_RESPUESTAS_F = 	new Integer[] {6,  9, 12, 34, 90, 91, 106, 165, 177, 179, 192, 210, 255, 276, 278, 280, 290, 295, 343};
	public static final HashMap<Integer, Integer> SC_MASCULINA = new HashMap<>();
	static {
		SC_MASCULINA.put(67,120);
		SC_MASCULINA.put(66,118);
		SC_MASCULINA.put(65,117);
		SC_MASCULINA.put(64,115);
		SC_MASCULINA.put(63,113);
		SC_MASCULINA.put(62,111);
		SC_MASCULINA.put(61,110);
		SC_MASCULINA.put(60,108);
		SC_MASCULINA.put(59,106);
		SC_MASCULINA.put(58,105);
		SC_MASCULINA.put(57,103);
		SC_MASCULINA.put(56,101);
		SC_MASCULINA.put(55,99);
		SC_MASCULINA.put(54,98);
		SC_MASCULINA.put(53,96);
		SC_MASCULINA.put(52,94);
		SC_MASCULINA.put(51,93);
		SC_MASCULINA.put(50,91);
		SC_MASCULINA.put(49,89);
		SC_MASCULINA.put(48,87);
		SC_MASCULINA.put(47,86);
		SC_MASCULINA.put(46,84);
		SC_MASCULINA.put(45,82);
		SC_MASCULINA.put(44,81);
		SC_MASCULINA.put(43,79);
		SC_MASCULINA.put(42,77);
		SC_MASCULINA.put(41,75);
		SC_MASCULINA.put(40,74);
		SC_MASCULINA.put(39,72);
		SC_MASCULINA.put(38,70);
		SC_MASCULINA.put(37,69);
		SC_MASCULINA.put(36,67);
		SC_MASCULINA.put(35,65);
		SC_MASCULINA.put(34,63);
		SC_MASCULINA.put(33,62);
		SC_MASCULINA.put(32,60);
		SC_MASCULINA.put(31,58);
		SC_MASCULINA.put(30,56);
		SC_MASCULINA.put(29,55);
		SC_MASCULINA.put(28,53);
		SC_MASCULINA.put(27,51);
		SC_MASCULINA.put(26,49);
		SC_MASCULINA.put(25,47);
		SC_MASCULINA.put(24,45);
		SC_MASCULINA.put(23,44);
		SC_MASCULINA.put(22,42);
		SC_MASCULINA.put(21,40);
		SC_MASCULINA.put(20,39);
		SC_MASCULINA.put(19,37);
		SC_MASCULINA.put(18,36);
		SC_MASCULINA.put(17,35);
		SC_MASCULINA.put(16,34);
		SC_MASCULINA.put(15,33);
		SC_MASCULINA.put(14,32);
		SC_MASCULINA.put(13,31);
		SC_MASCULINA.put(12,30);
	}
	public static final HashMap<Integer, Integer> SC_FEMENINA = new HashMap<>();
	static {
		SC_FEMENINA.put(73,120);
		SC_FEMENINA.put(72,119);
		SC_FEMENINA.put(71,118);
		SC_FEMENINA.put(70,116);
		SC_FEMENINA.put(69,115);
		SC_FEMENINA.put(68,113);
		SC_FEMENINA.put(67,112);
		SC_FEMENINA.put(66,111);
		SC_FEMENINA.put(65,109);
		SC_FEMENINA.put(64,108);
		SC_FEMENINA.put(63,106);
		SC_FEMENINA.put(62,105);
		SC_FEMENINA.put(61,103);
		SC_FEMENINA.put(60,102);
		SC_FEMENINA.put(59,100);
		SC_FEMENINA.put(58,99);
		SC_FEMENINA.put(57,97);
		SC_FEMENINA.put(56,96);
		SC_FEMENINA.put(55,94);
		SC_FEMENINA.put(54,93);
		SC_FEMENINA.put(53,91);
		SC_FEMENINA.put(52,90);
		SC_FEMENINA.put(51,88);
		SC_FEMENINA.put(50,87);
		SC_FEMENINA.put(49,85);
		SC_FEMENINA.put(48,84);
		SC_FEMENINA.put(47,82);
		SC_FEMENINA.put(46,81);
		SC_FEMENINA.put(45,79);
		SC_FEMENINA.put(44,78);
		SC_FEMENINA.put(43,76);
		SC_FEMENINA.put(42,75);
		SC_FEMENINA.put(41,73);
		SC_FEMENINA.put(40,72);
		SC_FEMENINA.put(39,70);
		SC_FEMENINA.put(38,69);
		SC_FEMENINA.put(37,67);
		SC_FEMENINA.put(36,66);
		SC_FEMENINA.put(35,65);
		SC_FEMENINA.put(34,63);
		SC_FEMENINA.put(33,62);
		SC_FEMENINA.put(32,60);
		SC_FEMENINA.put(31,59);
		SC_FEMENINA.put(30,57);
		SC_FEMENINA.put(29,55);
		SC_FEMENINA.put(28,53);
		SC_FEMENINA.put(27,52);
		SC_FEMENINA.put(26,50);
		SC_FEMENINA.put(25,48);
		SC_FEMENINA.put(24,46);
		SC_FEMENINA.put(23,44);
		SC_FEMENINA.put(22,42);
		SC_FEMENINA.put(21,41);
		SC_FEMENINA.put(20,39);
		SC_FEMENINA.put(19,37);
		SC_FEMENINA.put(18,36);
		SC_FEMENINA.put(17,34);
		SC_FEMENINA.put(16,33);
		SC_FEMENINA.put(15,32);
		SC_FEMENINA.put(14,31);
		SC_FEMENINA.put(13,30);
	}
	
	public static final String SUBESCALA_MA = "SUBESCALA_MA";
	public static final Integer[] MA_RESPUESTAS_T = 	new Integer[] {13, 15, 21, 23, 50, 55, 61, 85, 87, 98, 113, 122, 131, 145, 155, 168, 169, 182, 190, 200, 205, 206, 211, 212, 218, 220, 227, 229, 238, 242, 244, 248, 250, 253, 269};
	public static final Integer[] MA_RESPUESTAS_F = 	new Integer[] {88, 93, 100, 106, 107, 136, 154, 158, 167, 243, 263};
	public static final HashMap<Integer, Integer> MA_MASCULINA = new HashMap<>();
	static {
		MA_MASCULINA.put(43,120);
		MA_MASCULINA.put(42,117);
		MA_MASCULINA.put(41,114);
		MA_MASCULINA.put(40,110);
		MA_MASCULINA.put(39,107);
		MA_MASCULINA.put(38,104);
		MA_MASCULINA.put(37,101);
		MA_MASCULINA.put(36,98);
		MA_MASCULINA.put(35,94);
		MA_MASCULINA.put(34,91);
		MA_MASCULINA.put(33,88);
		MA_MASCULINA.put(32,85);
		MA_MASCULINA.put(31,81);
		MA_MASCULINA.put(30,78);
		MA_MASCULINA.put(29,75);
		MA_MASCULINA.put(28,72);
		MA_MASCULINA.put(27,69);
		MA_MASCULINA.put(26,65);
		MA_MASCULINA.put(25,62);
		MA_MASCULINA.put(24,59);
		MA_MASCULINA.put(23,56);
		MA_MASCULINA.put(22,53);
		MA_MASCULINA.put(21,51);
		MA_MASCULINA.put(20,49);
		MA_MASCULINA.put(19,47);
		MA_MASCULINA.put(18,45);
		MA_MASCULINA.put(17,43);
		MA_MASCULINA.put(16,41);
		MA_MASCULINA.put(15,39);
		MA_MASCULINA.put(14,38);
		MA_MASCULINA.put(13,36);
		MA_MASCULINA.put(12,35);
		MA_MASCULINA.put(11,33);
		MA_MASCULINA.put(10,31);
		MA_MASCULINA.put(9,30);
	}
	public static final HashMap<Integer, Integer> MA_FEMENINA = new HashMap<>();
	static {
		MA_FEMENINA.put(44,120);
		MA_FEMENINA.put(43,118);
		MA_FEMENINA.put(42,115);
		MA_FEMENINA.put(41,112);
		MA_FEMENINA.put(40,109);
		MA_FEMENINA.put(39,106);
		MA_FEMENINA.put(38,103);
		MA_FEMENINA.put(37,100);
		MA_FEMENINA.put(36,97);
		MA_FEMENINA.put(35,94);
		MA_FEMENINA.put(34,91);
		MA_FEMENINA.put(33,88);
		MA_FEMENINA.put(32,85);
		MA_FEMENINA.put(31,82);
		MA_FEMENINA.put(30,79);
		MA_FEMENINA.put(29,76);
		MA_FEMENINA.put(28,74);
		MA_FEMENINA.put(27,71);
		MA_FEMENINA.put(26,68);
		MA_FEMENINA.put(25,65);
		MA_FEMENINA.put(24,62);
		MA_FEMENINA.put(23,59);
		MA_FEMENINA.put(22,56);
		MA_FEMENINA.put(21,53);
		MA_FEMENINA.put(20,51);
		// 19??
		MA_FEMENINA.put(18,47);
		MA_FEMENINA.put(17,45);
		MA_FEMENINA.put(16,43);
		MA_FEMENINA.put(15,41);
		MA_FEMENINA.put(14,39);
		MA_FEMENINA.put(13,37);
		MA_FEMENINA.put(12,35);
		MA_FEMENINA.put(11,33);
		MA_FEMENINA.put(10,31);
		MA_FEMENINA.put(9,30);
	}
	
	public static final String SUBESCALA_SI = "SUBESCALA_SI";
	public static final Integer[] SI_RESPUESTAS_T = 	new Integer[] {31, 56, 70, 100, 105, 110, 127, 135, 158, 161, 167, 185, 215, 243, 251, 265, 275, 284, 289, 296, 302, 308, 326, 337, 338, 347, 348, 351, 352, 357, 364, 367, 368, 369};
	public static final Integer[] SI_RESPUESTAS_F = 	new Integer[] {25, 32, 49, 79, 86, 106, 112, 131, 181, 189, 207, 209, 231, 237, 255, 262, 267, 280, 321, 328, 335, 340, 342, 344, 345, 350, 353, 354, 358, 359, 360, 362, 363, 366, 370};
	public static final HashMap<Integer, Integer> SI_MASCULINA = new HashMap<>();
	static {
		SI_MASCULINA.put(69, 100);
		SI_MASCULINA.put(68, 99);
		SI_MASCULINA.put(67, 98);
		SI_MASCULINA.put(66, 97);
		SI_MASCULINA.put(65, 96);
		SI_MASCULINA.put(64, 94);
		SI_MASCULINA.put(63, 93);
		SI_MASCULINA.put(62, 92);
		SI_MASCULINA.put(61, 91);
		SI_MASCULINA.put(60, 90);
		SI_MASCULINA.put(59, 89);
		SI_MASCULINA.put(58, 87);
		SI_MASCULINA.put(57, 86);
		SI_MASCULINA.put(56, 85);
		SI_MASCULINA.put(55, 84);
		SI_MASCULINA.put(54, 83);
		SI_MASCULINA.put(53, 82);
		SI_MASCULINA.put(52, 80);
		SI_MASCULINA.put(51, 79);
		SI_MASCULINA.put(50, 78);
		SI_MASCULINA.put(49, 77);
		SI_MASCULINA.put(48, 76);
		SI_MASCULINA.put(47, 75);
		SI_MASCULINA.put(46, 73);
		SI_MASCULINA.put(45, 72);
		SI_MASCULINA.put(44, 71);
		SI_MASCULINA.put(43, 70);
		SI_MASCULINA.put(42, 69);
		SI_MASCULINA.put(41, 68);
		SI_MASCULINA.put(40, 66);
		SI_MASCULINA.put(39, 65);
		SI_MASCULINA.put(38, 64);
		SI_MASCULINA.put(37, 63);
		SI_MASCULINA.put(36, 62);
		SI_MASCULINA.put(35, 61);
		SI_MASCULINA.put(34, 59);
		SI_MASCULINA.put(33, 58);
		SI_MASCULINA.put(32, 57);
		SI_MASCULINA.put(31, 56);
		SI_MASCULINA.put(30, 55);
		SI_MASCULINA.put(29, 54);
		SI_MASCULINA.put(28, 52);
		SI_MASCULINA.put(27, 51);
		SI_MASCULINA.put(26, 50);
		SI_MASCULINA.put(25, 49);
		SI_MASCULINA.put(24, 48);
		SI_MASCULINA.put(23, 47);
		SI_MASCULINA.put(22, 45);
		SI_MASCULINA.put(21, 44);
		SI_MASCULINA.put(20, 43);
		SI_MASCULINA.put(19, 42);
		SI_MASCULINA.put(18, 41);
		SI_MASCULINA.put(17, 40);
		SI_MASCULINA.put(16, 38);
		SI_MASCULINA.put(15, 37);
		SI_MASCULINA.put(14, 36);
		SI_MASCULINA.put(13, 35);
		SI_MASCULINA.put(12, 34);
		SI_MASCULINA.put(11, 33);
		SI_MASCULINA.put(10, 31);
		SI_MASCULINA.put(9, 30);
	}
	public static final HashMap<Integer, Integer> SI_FEMENINA = new HashMap<>();
	static {
		SI_FEMENINA.put(69,95);
		SI_FEMENINA.put(68,94);
		SI_FEMENINA.put(67,93);
		SI_FEMENINA.put(66,91);
		SI_FEMENINA.put(65,90);
		SI_FEMENINA.put(64,89);
		SI_FEMENINA.put(63,88);
		SI_FEMENINA.put(62,87);
		SI_FEMENINA.put(61,86);
		SI_FEMENINA.put(60,85);
		SI_FEMENINA.put(59,84);
		SI_FEMENINA.put(58,83);
		SI_FEMENINA.put(57,82);
		SI_FEMENINA.put(56,81);
		SI_FEMENINA.put(55,79);
		SI_FEMENINA.put(54,78);
		SI_FEMENINA.put(53,77);
		SI_FEMENINA.put(52,76);
		SI_FEMENINA.put(51,75);
		SI_FEMENINA.put(50,74);
		SI_FEMENINA.put(49,73);
		SI_FEMENINA.put(48,72);
		SI_FEMENINA.put(47,71);
		SI_FEMENINA.put(46,70);
		SI_FEMENINA.put(45,69);
		SI_FEMENINA.put(44,67);
		SI_FEMENINA.put(43,66);
		SI_FEMENINA.put(42,65);
		SI_FEMENINA.put(41,64);
		SI_FEMENINA.put(40,63);
		SI_FEMENINA.put(39,62);
		SI_FEMENINA.put(38,61);
		SI_FEMENINA.put(37,60);
		SI_FEMENINA.put(36,59);
		SI_FEMENINA.put(35,58);
		SI_FEMENINA.put(34,57);
		SI_FEMENINA.put(33,55);
		SI_FEMENINA.put(32,54);
		SI_FEMENINA.put(31,53);
		SI_FEMENINA.put(30,52);
		SI_FEMENINA.put(29,51);
		SI_FEMENINA.put(28,50);
		SI_FEMENINA.put(27,49);
		SI_FEMENINA.put(26,48);
		SI_FEMENINA.put(25,47);
		SI_FEMENINA.put(24,46);
		SI_FEMENINA.put(23,45);
		SI_FEMENINA.put(22,43);
		SI_FEMENINA.put(21,42);
		SI_FEMENINA.put(20,41);
		SI_FEMENINA.put(19,40);
		SI_FEMENINA.put(18,39);
		SI_FEMENINA.put(17,38);
		SI_FEMENINA.put(16,37);
		SI_FEMENINA.put(15,36);
		SI_FEMENINA.put(14,35);
		SI_FEMENINA.put(13,34);
		SI_FEMENINA.put(12,33);
		SI_FEMENINA.put(11,32);
		SI_FEMENINA.put(10,30);
	}
}
