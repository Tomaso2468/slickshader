package slickshader;

import java.net.URL;

import org.newdawn.slick.SlickException;

/**
 * Simply interface for component that manages shaders source files.
 * 
 * @author Chronocide (Jeremy Klix)
 *
 */
public interface ShaderResourceManager {

	int getFragementShaderID(URL fragmentFileName) throws SlickException;

	int getVertexShaderID(URL vertexFileName) throws SlickException;

	/**
	 * Link a shader that the shader program depends on to operate.</br>
	 * 
	 * @param programID
	 * @param shaderID
	 */
	void createProgramShaderDependancy(int programID, int shaderID);

	void removeProgram(int programID);
}
