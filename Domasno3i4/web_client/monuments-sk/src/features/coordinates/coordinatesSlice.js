import { createSlice } from '@reduxjs/toolkit'

export const coordinatesSlice = createSlice({
  name: 'coordinates',
  initialState: {
    value: {lat: 0, lon: 0},
  },
  reducers: {
    setLocation: (state, action) => {
        state.value = action.payload
      },
  },
})

// Action creators are generated for each case reducer function
export const { setLocation } = coordinatesSlice.actions

export default coordinatesSlice.reducer