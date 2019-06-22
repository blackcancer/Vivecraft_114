package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VRTextureDepthInfo_t extends Structure {
	/** void * */
	public Pointer handle;
	public HmdMatrix44_t mProjection;
	public HmdVector2_t vRange;
	public VRTextureDepthInfo_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("handle", "mProjection", "vRange");
	}
	public VRTextureDepthInfo_t(Pointer handle, HmdMatrix44_t mProjection, HmdVector2_t vRange) {
		super();
		this.handle = handle;
		this.mProjection = mProjection;
		this.vRange = vRange;
	}
	public VRTextureDepthInfo_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VRTextureDepthInfo_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VRTextureDepthInfo_t implements Structure.ByValue {
		
	};
}
