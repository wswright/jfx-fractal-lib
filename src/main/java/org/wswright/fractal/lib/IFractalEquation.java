package org.wswright.fractal.lib;

import org.jetbrains.annotations.NotNull;

public interface IFractalEquation {
	/**
	 * Calculate the number of iterations a point takes to leave a bound.
	 * @param z Real part
	 * @param c Complex part
	 * @return Returns a ComplexAlgebraicForm
	 */
	@NotNull
	ComplexAlgebraicForm calculateFractalIteration(ComplexAlgebraicForm z, ComplexAlgebraicForm c);
	String getDisplayName();
}
